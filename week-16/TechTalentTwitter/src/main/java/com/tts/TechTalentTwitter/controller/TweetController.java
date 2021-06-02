package com.tts.TechTalentTwitter.controller;

import com.tts.TechTalentTwitter.model.Tweet;
import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.service.TweetService;
import com.tts.TechTalentTwitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TweetController {

    // here we are adding the service dependencies,
    // you can either autowire both or inject them via a constructor
//    @Autowired
    private UserService userService;
//    @Autowired
    private TweetService tweetService;

    public TweetController(UserService userService, TweetService tweetService) {
        this.userService = userService;
        this.tweetService = tweetService;
    }

    @GetMapping({"/tweets", "/"})
    public String getFeed(Model model) {
        List<Tweet> tweets = tweetService.findAll();
        model.addAttribute("tweetList", tweets);
        return "feed";
    }


    @GetMapping("/tweets/new")
    public String getTweetForm(Model model) {
        model.addAttribute("tweet", new Tweet());
        return "newTweet";
    }

    @PostMapping("/tweets")
    public String submitTweetForm(@Valid Tweet tweet,
                                  BindingResult bindingResult,
                                  Model model) {
        User user = userService.getLoggedInUser();
        if (!bindingResult.hasErrors()) {
            tweet.setUser(user);
            tweetService.save(tweet);
            model.addAttribute("successMessage", "Tweet Successfully created!");
            model.addAttribute("tweet", new Tweet());
        }
        return "newTweet";
    }
}
