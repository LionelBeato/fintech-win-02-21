package com.tts.Spring.Boot.Start.controller;

import com.tts.Spring.Boot.Start.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// this controller is for our thymleaf
@Controller
public class SimpleController {

    // this value is comming from the variable defined in application.props
    @Value("${spring.application.name}")
    String appName;

    @Autowired
    BookRepository bookRepository;

    // below we are using an object of type Model
    // this describes a UI element that will appear in html
    // typically, these are used for template engine solutions
    // such as thymeleaf
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("books", bookRepository.findAll());
        // this return is referencing the name of our template html;
        return "home";
    }

}
