package com.yehor.syrin.eshoperer;

import com.yehor.syrin.eshoperer.api.games.impl.EuGameFetcher;
import com.yehor.syrin.eshoperer.api.games.impl.UsGameFetcher;
import com.yehor.syrin.eshoperer.api.model.game.Game;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        EuGameFetcher euGameFetcher = new EuGameFetcher();
        euGameFetcher.setUrl("http://search.nintendo-europe.com/en/select?");
        HashMap<String, String> params = new HashMap<>();
        params.put("fq", "type:GAME AND system_type:nintendoswitch* AND product_code_txt:*");
        params.put("q", "*");
        params.put("rows", "7000");
        euGameFetcher.setParams(params);
        List<Game> games = euGameFetcher.fetchGame();
        System.out.println(games.size());


//        UsGameFetcher gameFetcher = new UsGameFetcher();
//        List<Game> games = gameFetcher.fetchGame();
//        System.out.println(games);
    }
}
