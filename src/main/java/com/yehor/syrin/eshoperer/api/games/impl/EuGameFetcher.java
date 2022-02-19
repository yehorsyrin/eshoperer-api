package com.yehor.syrin.eshoperer.api.games.impl;

import com.yehor.syrin.eshoperer.api.games.GamesFetcher;
import com.yehor.syrin.eshoperer.api.model.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
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
        doRequest(url, params);
        return null;
    }
}
