package com.WetherApi.WetherApplication.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private static final String API_KEY = "bd41afe76cmsh7650a29b458a612p1b8c5bjsn46f32f6eac4d";
//    private static final String BASE_URL = "https://forecast9.p.rapidapi.com/";

    private final OkHttpClient client;

    public WeatherService() {
        this.client = new OkHttpClient();
    }

    public String getWeatherSummary(String location) throws IOException {
//        Request request = new Request.Builder()
//                .url(BASE_URL + "forecast/" + location + "/summary/")
//                .addHeader("x-rapidapi-key", API_KEY)
//                .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
//                .build();
    	 Request request = new Request.Builder()
                 .url(String.format("https://forecast9.p.rapidapi.com/rapidapi/forecast/%s/summary/",location))
                 .addHeader("x-rapidapi-key", API_KEY)
                 .addHeader("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
                 .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            return response.body().string();
        }
    }

    public String getHourlyWeather(String location) throws IOException {
    	Request request = new Request.Builder()
                .url(String.format("https://forecast9.p.rapidapi.com/rapidapi/forecast/%s/hourly/",location))
                .addHeader("x-rapidapi-key", API_KEY)
                .addHeader("X-RapidAPI-Host","forecast9.p.rapidapi.com")
                .build();
       try (Response response = client.newCall(request).execute()) {
           if (!response.isSuccessful()) {
               throw new IOException("Unexpected code " + response);
           }
           return response.body().string();
       }
    }
}

