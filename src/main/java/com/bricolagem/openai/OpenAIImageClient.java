package com.bricolagem.openai;

import okhttp3.*;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OpenAIImageClient {

    private static final String API_KEY = System.getenv("OPENAI_API_KEY");
    private static final String ENDPOINT = "https://api.openai.com/v1/images/generations";

    public static String gerarImagem(String prompt) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
        MediaType JSON = MediaType.parse("application/json");
        String jsonBody = new JSONObject()
                .put("model", "dall-e-3")
                .put("prompt", prompt)
                .put("n", 1)
                .put("size", "1024x1024")
                .put("response_format", "url")
                .toString();

        Request request = new Request.Builder()
                .url(ENDPOINT)
                .addHeader("Authorization", "Bearer " + API_KEY)
                .addHeader("Content-Type", "application/json")
                .post(RequestBody.create(jsonBody, JSON))
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erro: " + response.code() + " - " + response.message() + "\n" + response.body().string());
            }

            String resposta = response.body().string();
            JSONObject json = new JSONObject(resposta);
            return json.getJSONArray("data").getJSONObject(0).getString("url");
        }
    }
}
