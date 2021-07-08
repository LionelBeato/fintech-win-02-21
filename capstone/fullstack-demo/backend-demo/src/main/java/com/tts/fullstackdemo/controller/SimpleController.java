package com.tts.fullstackdemo.controller;

import com.tts.fullstackdemo.model.SimpleModel;
import com.tts.fullstackdemo.repo.SimpleModelRepository;
import com.tts.fullstackdemo.service.SimpleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class SimpleController {

    @Autowired
    SimpleModelService service;

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
//        System.out.println(model);
//        return model;
        return service.createModel(model);
    }

    @GetMapping("/all")
    public List<SimpleModel> getAllModels() {
        return service.readAllModels();
    }

}
