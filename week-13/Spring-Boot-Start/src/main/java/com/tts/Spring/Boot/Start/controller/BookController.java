package com.tts.Spring.Boot.Start.controller;


import com.tts.Spring.Boot.Start.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    // this is a form of dependency injection
    // we are allowing BookController to pick up a candidate for this field
    @Autowired
    private BookRepository bookRepository;



}
