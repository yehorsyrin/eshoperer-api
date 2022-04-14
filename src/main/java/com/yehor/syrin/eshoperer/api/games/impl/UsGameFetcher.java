package com.yehor.syrin.eshoperer.api.games.impl;

import com.yehor.syrin.eshoperer.api.games.GamesFetcher;
import com.yehor.syrin.eshoperer.api.games.JsonToGameMapper;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import com.yehor.syrin.eshoperer.api.model.game.UsGame;
import com.yehor.syrin.eshoperer.api.trash.Constants;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class UsGameFetcher extends GamesFetcher {
    private final String URL = "https://U3B6GR4UA3-dsn.algolia.net/1/indexes/*/queries?";
    private final HashMap<String, String> HEADERS = new HashMap<>();

    {
        HEADERS.put("X-Algolia-API-Key", "c4da8be7fd29f0f5bfa42920b0a99dc7");
        HEADERS.put("X-Algolia-Application-Id", "U3B6GR4UA3");
    }

    @Override
    public List<Game> fetchGame() throws IOException, InterruptedException {
        return fetchGame(jsonGame -> {
            UsGame game = new UsGame();
            game.setNsuid(Collections.singletonList(jsonGame.getString("nsuid")));
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
    public List<Game> fetchGame(JsonToGameMapper mapper) throws IOException, InterruptedException {
        JSONObject root = doPostRequest(URL, Constants.US_GAMES_POST_BODY, HEADERS);
        JSONArray results = root.getJSONArray("results");
        JSONObject arrayElement = results.getJSONObject(0);
        JSONArray hits = arrayElement.getJSONArray("hits");
        List<Game> result = new ArrayList<>();
        for (int i = 0; i < hits.length(); i++) {
            JSONObject jsonGame = hits.getJSONObject(i);
            result.add(mapper.mapValues(jsonGame));
        }
        return result;
    }
}
