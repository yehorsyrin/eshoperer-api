package com.yehor.syrin.eshoperer;

import com.yehor.syrin.eshoperer.api.games.impl.EuGameFetcher;

import java.io.IOException;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        EuGameFetcher euGameFetcher = new EuGameFetcher();
        euGameFetcher.setUrl("http://search.nintendo-europe.com/en/select?");
        HashMap<String, String> params = new HashMap<>();
        params.put("fq", "type:GAME AND system_type:nintendoswitch* AND product_code_txt:*");
        params.put("q", "*");
        params.put("rows", "2");
        euGameFetcher.setParams(params);
        System.out.println(euGameFetcher.fetchGame());
    }
}
