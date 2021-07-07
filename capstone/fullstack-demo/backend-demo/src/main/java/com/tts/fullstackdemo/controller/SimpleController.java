package com.tts.fullstackdemo.controller;

import com.tts.fullstackdemo.model.SimpleModel;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
public class SimpleController {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "hello world";
    }

    // i am going to target this method specifically
    // this method will resolve at localhost:8080/simple
    @GetMapping("/simple")
    public SimpleModel getModel() {
        return new SimpleModel(36L, "Jeff");
    }

    @PostMapping("/post")
    public SimpleModel postModel(@RequestBody SimpleModel model) {
        System.out.println(model);
        return model;
    }

}
