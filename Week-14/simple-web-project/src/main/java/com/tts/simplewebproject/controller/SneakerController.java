package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Sneaker;
import com.tts.simplewebproject.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
public class SneakerController {

    @Autowired
    SneakerRepository sneakerRepository;

    @GetMapping("/")
//    @ResponseBody
    public String returnHelloWorld() {
        System.out.println("This will work");
        return "Hello world";
    }

    @GetMapping("/sneaker")
    public Sneaker returnNewSneaker() {
        return new Sneaker("blue");
    }

    @GetMapping("/all")
    public Iterable<Sneaker> getAllSneakers() {
        return sneakerRepository.findAll();
    }

    @PostMapping("/add")
    public Sneaker addSneaker(@RequestBody Sneaker sneaker) {
        return sneakerRepository.save(sneaker);
    }

}
