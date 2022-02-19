package com.yehor.syrin.eshoperer.api.games;

import com.yehor.syrin.eshoperer.api.model.Game;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public abstract class GamesFetcher {

    public abstract List<Game> fetchGame() throws IOException, InterruptedException;


    protected JSONObject doRequest(String url, HashMap<String, String> params) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        StringBuilder finalUrl = new StringBuilder(url);
        for (String param : params.keySet()) {
            finalUrl.append(param).append("=").append(URLEncoder.encode(params.get(param), StandardCharsets.UTF_8)).append("&");
        }
        URI uri = URI.create(finalUrl.toString());
        HttpRequest request = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return new JSONObject(response.body());
    }

}
