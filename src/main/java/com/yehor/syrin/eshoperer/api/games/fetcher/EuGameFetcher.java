package com.yehor.syrin.eshoperer.api.games.fetcher;

import com.yehor.syrin.eshoperer.api.games.mappers.JsonToGameMapper;
import com.yehor.syrin.eshoperer.api.model.game.EuGame;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class EuGameFetcher extends GamesFetcher {

    private HashMap<String, String> params;

    public EuGameFetcher() {
        this.url = "http://search.nintendo-europe.com/en/select?";
        this.params = new HashMap<>();
        this.params.put("fq", "type:GAME AND system_type:nintendoswitch* AND product_code_txt:*");
        this.params.put("q", "*");
        this.params.put("rows", "7000");
    }


    @Override
    public List<Game> fetchGame() throws IOException, InterruptedException {
        return fetchGame(gameJson -> {
            EuGame game = new EuGame();
            game.setTitle(gameJson.getString("title"));
            game.setDescription(gameJson.getString("product_catalog_description_s"));
            game.setImg(gameJson.getString("image_url_sq_s"));
            game.setPopularity(gameJson.getInt("popularity"));
            game.setType(gameJson.getString("type"));
            if (gameJson.has("nsuid_txt")) {
                game.setNsuid(parseJsonArray(gameJson.getJSONArray("nsuid_txt")));
            }
            game.setLanguageAvailability(parseJsonArray(gameJson.getJSONArray("language_availability")));
            if (gameJson.has("game_category")) {
                game.setGameCategory(parseJsonArray(gameJson.getJSONArray("game_category")));
            }
            if (isSaveFullJson()) {
                game.setRawJson(gameJson.toString());
            }
            return game;
        });
    }

    @Override
    public List<Game> fetchGame(JsonToGameMapper mapper) throws IOException, InterruptedException {
        List<Game> resultList = new ArrayList<>();
        JSONObject root = doGetrequest(url, params, new HashMap<>());
        JSONObject response = root.getJSONObject("response");
        JSONArray gamesJson = response.getJSONArray("docs");
        for (int i = 0; i < gamesJson.length(); i++) {
            JSONObject gameJson = gamesJson.getJSONObject(i);
            resultList.add(mapper.mapValues(gameJson));
        }
        return resultList;
    }

}
