package com.tts.TechTalentTwitter.controller;

import com.tts.TechTalentTwitter.model.Tweet;
import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.service.TweetService;
import com.tts.TechTalentTwitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {

//    @Autowired
    UserService userService;
//    @Autowired
    TweetService tweetService;

    public UserController(UserService userService, TweetService tweetService) {
        this.userService = userService;
        this.tweetService = tweetService;
    }

    @GetMapping("/users/{username}")
    public String getUser(@PathVariable("username") String username, Model model) {
        User user = userService.findByUserName(username);
        List<Tweet> tweets = tweetService.findAllByUser(user);
        model.addAttribute("tweetList", tweets);
        model.addAttribute("user", user);
        return "user";
    }


}
