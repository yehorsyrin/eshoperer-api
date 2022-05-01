package com.yehor.syrin.eshoperer.api;

import com.goebl.david.Request;
import com.goebl.david.Webb;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public abstract class Fetcher {

    protected JSONObject doGetrequest(String url, HashMap<String, String> params, HashMap<String, String> headers) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        StringBuilder finalUrl = new StringBuilder(url);
        for (Map.Entry<String, String> param : params.entrySet()) {
            finalUrl.append(param.getKey()).append("=")
                    .append(URLEncoder.encode(param.getValue(), StandardCharsets.UTF_8)).append("&");
        }
        URI uri = URI.create(finalUrl.toString());
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(uri);
        for (Map.Entry<String, String> header : headers.entrySet()) {
            requestBuilder = requestBuilder.header(header.getKey(), header.getValue());
        }
        HttpResponse<String> response = httpClient.send(requestBuilder.build(), HttpResponse.BodyHandlers.ofString());
        return new JSONObject(response.body());
    }

    protected JSONObject doPostRequest(String url, String body, HashMap<String, String> headers) {
        Webb webb = Webb.create();
        Request req = webb.post(url)
                .body(body);
        for (Map.Entry<String, String> param : headers.entrySet()) {
            req.header(param.getKey(), param.getValue());
        }
        return req.ensureSuccess().asJsonObject().getBody();
    }
}
