package com.tts.TechTalentTwitter.controller;

import com.tts.TechTalentTwitter.model.User;
import com.tts.TechTalentTwitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthorizationController {

    // injecting our UserService
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    // this method allows us to have a new user posted to our database
    // we are going to validate the user
    @PostMapping("/signup")
    public String createNewUser(@Valid User user,
                                BindingResult bindingResult,
                                Model model) {

        // here we make an object that will either return a user
        // from our repository our return null
        User userExists = userService.findByUserName(user.getUsername());


        // null-checking our user variable
        if(userExists != null) {
            bindingResult.rejectValue("username",
                    "error.user",
                    "Username is already taken");
        }
        // ensuring there's no errors with the binding results
        // if there's no errors, we can go ahead and continue
        if(!bindingResult.hasErrors()) {
            userService.saveNewUser(user);
            model.addAttribute("success",
                    "Sign up successful");
            model.addAttribute("user", new User());
        }

        // return a reference to the template
        return "registration";
    }



}
