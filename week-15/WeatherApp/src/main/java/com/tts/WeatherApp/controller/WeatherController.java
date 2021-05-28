package com.tts.WeatherApp.controller;

import com.tts.WeatherApp.model.Request;
import com.tts.WeatherApp.model.Response;
import com.tts.WeatherApp.model.ZipCode;
import com.tts.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());
        return "index";
    }

    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        return "index";
    }

    @ModelAttribute("searches")
    public List<ZipCode> getLatestZipcodes() {
        return weatherService.getLatestZipCodeSearches();
    }

}
