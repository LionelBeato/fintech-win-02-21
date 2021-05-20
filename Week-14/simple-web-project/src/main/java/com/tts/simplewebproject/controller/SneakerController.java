package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Sneaker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class SneakerController {

    @GetMapping("/")
//    @ResponseBody
    public String returnHelloWorld() {
        System.out.println("This will work");
        return "Hello world";
    }

    @GetMapping("/sneaker")
    public Sneaker returnNewSneaker() {
        return new Sneaker(2L, "blue");
    }

}
