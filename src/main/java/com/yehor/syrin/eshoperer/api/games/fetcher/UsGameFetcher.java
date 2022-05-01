package com.yehor.syrin.eshoperer.api.games.fetcher;

import com.yehor.syrin.eshoperer.api.games.mappers.JsonToGameMapper;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import com.yehor.syrin.eshoperer.api.model.game.UsGame;
import com.yehor.syrin.eshoperer.api.trash.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class UsGameFetcher extends GamesFetcher {
    private HashMap<String, String> headers;

    public UsGameFetcher() {
        this.url = "https://U3B6GR4UA3-dsn.algolia.net/1/indexes/*/queries?";
        this.headers = new HashMap<>();
        this.headers.put("X-Algolia-API-Key", "c4da8be7fd29f0f5bfa42920b0a99dc7");
        this.headers.put("X-Algolia-Application-Id", "U3B6GR4UA3");
    }

    @Override
    public List<Game> fetchGame() {
        return fetchGame(jsonGame -> {
            UsGame game = new UsGame();
            if (jsonGame.has("nsuid")) {
                game.setNsuid(Collections.singletonList(jsonGame.getString("nsuid")));
            }
            game.setTitle(jsonGame.getString("title"));
            if (jsonGame.has("boxart")) {
                game.setImg(jsonGame.getString("boxart"));
            } else if (jsonGame.has("horizontalHeaderImage")) {
                game.setImg(jsonGame.getString("horizontalHeaderImage"));
            }
            game.setDescription(jsonGame.getString("description"));
            game.setGameCategory(parseJsonArray(jsonGame.getJSONArray("genres")));
            if (isSaveFullJson()) {
                game.setRawJson(jsonGame.toString());
            }
            return game;
        });
    }

    @Override
    public List<Game> fetchGame(JsonToGameMapper mapper) {
        JSONObject root = doPostRequest(url,
                Constants.US_GAMES_POST_BODY, headers);
        List<Game> result = new ArrayList<>();
        JSONArray results = root.getJSONArray("results");
        for (int j = 0; j < results.length(); j++) {
            JSONObject arrayElement = results.getJSONObject(j);
            JSONArray hits = arrayElement.getJSONArray("hits");
            for (int i = 0; i < hits.length(); i++) {
                JSONObject jsonGame = hits.getJSONObject(i);
                result.add(mapper.mapValues(jsonGame));
            }
        }
        return result;
    }
}
