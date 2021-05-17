package com.tts.week14day1.controller;


import com.tts.week14day1.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/books") // it's good practice to give a mapping to your controller class
public class BookController {

    @GetMapping
    public String getBooks(Model model) {
        List<Book> bookList = List.of(
                new Book(1L, "title one", "author one"),
                new Book(2L, "title two", "author two")
        );
        model.addAttribute("books", bookList);
        return "greeting";
    }

    @GetMapping("/endpoint")
    @ResponseBody
    public String myEndpoint(){
        return "this is my endpoint";
    }

//    @GetMapping("/")
//    public String root() {
//        return "this is my root";
//    }

}
