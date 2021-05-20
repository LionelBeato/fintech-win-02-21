package com.tts.TechtTalentBlog.controller;

import com.tts.TechtTalentBlog.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping("/")
    public String index(BlogPost blogPost) {
        // this return value is a reference to a template
        // it will not literally return a string value
        return "blogpost/index";
    }

}
