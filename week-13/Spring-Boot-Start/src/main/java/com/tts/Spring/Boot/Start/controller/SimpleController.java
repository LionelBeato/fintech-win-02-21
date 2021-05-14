package com.tts.Spring.Boot.Start.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    // this value is comming from the variable defined in application.props
    @Value("${spring.application.name}")
    String appName;

    // below we are using an object of type Model
    // this describes a UI element that will appear in html
    // typically, these are used for template engine solutions
    // such as thymeleaf
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

}
