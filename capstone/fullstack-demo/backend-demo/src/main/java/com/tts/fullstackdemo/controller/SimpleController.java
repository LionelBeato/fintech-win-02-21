package com.tts.fullstackdemo.controller;

import com.tts.fullstackdemo.model.User;
import com.tts.fullstackdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
//@Profile("dev")
public class SimpleController {

    @Autowired
    UserService service;

    @Value("${msg.statement}")
    String message;


    @GetMapping("/greeting")
    public String getGreeting() {
        return "hello world";
    }

    // i am going to target this method specifically
    // this method will resolve at localhost:8080/simple
    @GetMapping("/simple")
    public User getModel() {
        return new User(36L, "Jeff");
    }

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }



    @PostMapping("/post")
    public User postModel(@RequestBody User model) {
//        System.out.println(model);
//        return model;
        return service.createModel(model);
    }

    @GetMapping("/all")
    public List<User> getAllModels() {
        return service.readAllModels();
    }

}
