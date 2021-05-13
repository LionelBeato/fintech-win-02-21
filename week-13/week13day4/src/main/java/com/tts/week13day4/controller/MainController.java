package com.tts.week13day4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// this annotation allows us to create routes
// basically allowing restful endpoints
@RestController
// this is to indicate
@RequestMapping("/main")
public class MainController {

    // this is an endpoint
    // we can access this resource on this endpoint
    // all that we get back is a string, however
    @GetMapping("/hello")
    public String home() {
        return "Hello World";
    }

    // going to an endpoint will resolve the method
    // meaning that any algorithms will also resolve
    @GetMapping("/math")
    public Integer doMath() {
        return 5 + 4;
    }

    @RequestMapping("/print")
    public void doPrint() {
        System.out.println("hello from the terminal");
    }


}
