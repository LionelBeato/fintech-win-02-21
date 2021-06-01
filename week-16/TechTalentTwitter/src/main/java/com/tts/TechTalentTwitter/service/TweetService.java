package com.tts.TechTalentTwitter.service;


import com.tts.TechTalentTwitter.model.Tweet;
import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public List<Tweet> findAll() {
        return tweetRepository.findAllByOrderByCreatedAtDesc();
    }

    public List<Tweet> findAllByUser(User user) {
        return tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
    }

    public List<Tweet> findAllByUsers(List<User> users) {
        return tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
    }

    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }



}
