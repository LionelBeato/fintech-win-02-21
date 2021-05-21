package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Sneaker;
import com.tts.simplewebproject.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/sneakers")
public class SneakerController {

    @Autowired
    SneakerRepository sneakerRepository;

//    @GetMapping("/")
////    @ResponseBody
//    public String returnHelloWorld() {
//        System.out.println("This will work");
//        return "Hello world";
//    }

    @GetMapping("/sneaker")
    public Sneaker returnNewSneaker() {
        return new Sneaker("blue");
    }

    @GetMapping("/all")
    public Iterable<Sneaker> getAllSneakers() {
        return sneakerRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Sneaker> getSneakerById(@PathVariable Long id) {
        return sneakerRepository.findById(id);
    }

    @PostMapping("/post")
    public Sneaker addSneaker(@RequestBody Sneaker sneaker) {
        return sneakerRepository.save(sneaker);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSneaker(@PathVariable Long id) {
        sneakerRepository.deleteById(id);
    }

    @DeleteMapping("/delete/color/{color}")
//    @RequestMapping(value="/delete/color/{color}", method=RequestMethod.DELETE)
    public void deleteSneakersByColor(@PathVariable String color) {
        sneakerRepository.deleteAllByColor(color);
    }
}
