package com.tts.simplewebproject.controller;

import com.tts.simplewebproject.model.Sneaker;
import com.tts.simplewebproject.repository.SneakerRepository;
import com.tts.simplewebproject.service.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/sneakers")
public class SneakerController {

//    @Autowired
//    SneakerRepository sneakerRepository;

    @Autowired
    SneakerService sneakerService;

//    @GetMapping("/")
////    @ResponseBody
//    public String returnHelloWorld() {
//        System.out.println("This will work");
//        return "Hello world";
//    }

    //
    @GetMapping("/sneaker")
    public Sneaker returnNewSneaker() {
        return new Sneaker("blue");
    }

//    @GetMapping("/all")
//    public Iterable<Sneaker> getAllSneakers() {
//        return sneakerRepository.findAll();
//    }

    @GetMapping("/get/{id}")
    public Sneaker getSneakerById(@PathVariable Long id) {
        return sneakerService.readSneakerById(id);
    }

    @PutMapping("/put/{id}")
    public Sneaker updateSneakerById(@PathVariable Long id,
                                               @RequestBody Sneaker sneaker) {
        return sneakerService.updateSneakerById(id, sneaker);
    }

//    @GetMapping("/get/color/{color}")
//    public Optional<Sneaker> getSneakerByColor(@PathVariable String color) {
//        return sneakerRepository.findFirstByColor(color);
//    }

    @PostMapping("/post")
    public Sneaker addSneaker(@RequestBody Sneaker sneaker) {
        return sneakerService.createSneaker(sneaker);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSneaker(@PathVariable Long id) {
       return sneakerService.deleteSneakerById(id);
    }



//    @DeleteMapping("/delete/color/{color}")
////    @RequestMapping(value="/delete/color/{color}", method=RequestMethod.DELETE)
//    public void deleteSneakersByColor(@PathVariable String color) {
//        sneakerRepository.deleteByColor(color);
//    }



}
