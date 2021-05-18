package com.tts.authentication.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // this method allows us to add view controllers to our application
    // the addViewController method defines a path
    // the setViewName method sets that path to a template
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home")
                .setViewName("home");

        registry.addViewController("/")
                .setViewName("home");

        registry.addViewController("/hello")
                .setViewName("hello");

        registry.addViewController("/login")
                .setViewName("login");
    }

}
