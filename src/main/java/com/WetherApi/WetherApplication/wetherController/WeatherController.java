package com.WetherApi.WetherApplication.wetherController;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WetherApi.WetherApplication.service.WeatherService;


@RestController
public class WeatherController {
	@Autowired
    private WeatherService weatherService;
	

    @GetMapping("/weatherSummary")
    public ResponseEntity<?> getWeatherSummary(@RequestParam String city) throws IOException {
        return ResponseEntity.ok(weatherService.getWeatherSummary(city));
    }

    @GetMapping("/hourlyWeather")
    public ResponseEntity<?> getHourlyWeather(@RequestParam String city) throws IOException {
        return ResponseEntity.ok(weatherService.getHourlyWeather(city));
    }
}
