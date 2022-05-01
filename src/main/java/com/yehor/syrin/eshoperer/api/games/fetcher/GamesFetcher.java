package com.yehor.syrin.eshoperer.api.games.fetcher;

import com.yehor.syrin.eshoperer.api.Fetcher;
import com.yehor.syrin.eshoperer.api.games.mappers.JsonToGameMapper;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class GamesFetcher extends Fetcher {

    protected String url;
    private boolean saveFullJson = false;

    public abstract List<Game> fetchGame() throws IOException, InterruptedException;


    protected List<String> parseJsonArray(JSONArray jsonArray) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

    public abstract List<Game> fetchGame(JsonToGameMapper mapper) throws IOException, InterruptedException;

}
