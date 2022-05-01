package com.yehor.syrin.eshoperer.api.prices;

import com.yehor.syrin.eshoperer.api.Fetcher;
import com.yehor.syrin.eshoperer.api.model.game.Game;
import com.yehor.syrin.eshoperer.api.model.PriceData;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PriceFetcher extends Fetcher {

    private String url;

    public void fillPrices(List<Game> games) {
        StringBuilder ids = new StringBuilder();
        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            ids.append(game.getNsuid());
            if (i != games.size() - 1) {
                ids.append(",");
            }
        }
    }

    private List<PriceData> collectPrices(String ids, List<String> countryCodes) {
        List<PriceData> priceData = new ArrayList<>();
        HashMap<String, String> params = new HashMap<>();
        params.put("ids", ids);
        countryCodes.forEach(code -> {
            params.put("country", code);
            JSONObject root = null;
            try {
                root = doGetrequest(url, params, new HashMap<>());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            JSONArray prices = root.getJSONArray("prices");
            PriceData data = new PriceData();
            for (int i = 0; i < prices.length(); i++) {
                JSONObject price = prices.getJSONObject(i);
                //data.setPrice();
            }
        });
        return priceData;
    }

}
