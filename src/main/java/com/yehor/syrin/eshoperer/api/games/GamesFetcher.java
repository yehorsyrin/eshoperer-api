package com.yehor.syrin.eshoperer.api.games;

import com.yehor.syrin.eshoperer.api.model.Game;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public abstract class GamesFetcher {

    private boolean saveFullJson = false;

    public abstract List<Game> fetchGame() throws IOException, InterruptedException;


    protected JSONObject doRequest(String url, HashMap<String, String> params) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        StringBuilder finalUrl = new StringBuilder(url);
        for (Map.Entry<String, String> param : params.entrySet()) {
            finalUrl.append(param.getKey()).append("=")
                    .append(URLEncoder.encode(param.getValue(), StandardCharsets.UTF_8)).append("&");
        }
        URI uri = URI.create(finalUrl.toString());
        HttpRequest request = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return new JSONObject(response.body());
    }

    protected List<String> parseJsonArray(JSONArray jsonArray) {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

}
