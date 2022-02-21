package com.yehor.syrin.eshoperer.api.games.impl;

import com.yehor.syrin.eshoperer.api.games.GamesFetcher;
import com.yehor.syrin.eshoperer.api.model.EuGame;
import com.yehor.syrin.eshoperer.api.model.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EuGameFetcher extends GamesFetcher {

    private String url;
    private HashMap<String, String> params;


    @Override
    public List<Game> fetchGame() throws IOException, InterruptedException {
        List<Game> resultList = new ArrayList<>();
        JSONObject root = doRequest(url, params);
        JSONObject response = root.getJSONObject("response");
        JSONArray gamesJson = response.getJSONArray("docs");
        for (int i = 0; i < gamesJson.length(); i++) {
            JSONObject gameJson = gamesJson.getJSONObject(i);
            EuGame game = new EuGame();
            game.setTitle(gameJson.getString("title"));
            game.setDescription(gameJson.getString("product_catalog_description_s"));
            game.setImg(gameJson.getString("image_url_sq_s"));
            game.setPopularity(gameJson.getInt("popularity"));
            game.setType(gameJson.getString("type"));
            game.setNsuid(parseJsonArray(gameJson.getJSONArray("nsuid_txt")));
            game.setLanguageAvailability(parseJsonArray(gameJson.getJSONArray("language_availability")));
            if (isSaveFullJson()) {
                game.setRawJson(gameJson.toString());
            }
            resultList.add(game);
        }
        return resultList;
    }
}
