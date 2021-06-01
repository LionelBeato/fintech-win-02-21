package com.tts.TechTalentTwitter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    // this will allow to encrypt user passwords
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // below we're instantiating BycryptPasswordEncoder
        // assigning it to a variable
        // and we'll need to return it
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

       // instead we can simply return the instantiation
        return new BCryptPasswordEncoder();
    }

}
