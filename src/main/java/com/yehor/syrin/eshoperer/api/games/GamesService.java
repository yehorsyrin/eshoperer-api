package com.yehor.syrin.eshoperer.api.games;

import com.yehor.syrin.eshoperer.api.games.fetcher.EuGameFetcher;
import com.yehor.syrin.eshoperer.api.games.fetcher.GamesFetcher;
import com.yehor.syrin.eshoperer.api.games.fetcher.UsGameFetcher;
import com.yehor.syrin.eshoperer.api.games.mappers.GamesMapper;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import lombok.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class GamesService {

    private List<GamesFetcher> fetchers;

    public GamesService() {
        fetchers = new ArrayList<>();
        fetchers.add(new EuGameFetcher());
        fetchers.add(new UsGameFetcher());
    }

    public GamesService(List<GamesFetcher> fetchers) {
        this.fetchers = fetchers;
    }

    public List<List<Game>> fetchAllGames() throws IOException, InterruptedException {
        List<List<Game>> result = new ArrayList<>();
        for (GamesFetcher fetcher : fetchers) {
            List<Game> list = fetcher.fetchGame();
            result.add(list);
        }
        return result;
    }

    public Map<String, List<Game>> getAllMappedGames(GamesMapper mapper) throws IOException, InterruptedException {
        return mapper.mapGames(fetchAllGames());
    }

    public Map<String, List<Game>> getAllMappedGames() throws IOException, InterruptedException {
        return getAllMappedGames(this::defaultMap);
    }

    private HashMap<String, List<Game>> defaultMap(List<List<Game>> gamesLists) {
        HashMap<String, List<Game>> mapped = new HashMap<>();
        for (List<Game> games : gamesLists) {
            for (Game game : games) {
                String cleaned = getCleanedString(game.getTitle());
                if(mapped.containsKey(cleaned)){
                    mapped.get(cleaned).add(game);
                } else {
                    ArrayList<Game> list = new ArrayList<>();
                    list.add(game);
                    mapped.put(cleaned, list);
                }
            }
        }
        return mapped;
    }
    private String getCleanedString(String s) {
        return s.replaceAll("[^A-Za-z0-9 ]", "").toLowerCase();
    }


}
