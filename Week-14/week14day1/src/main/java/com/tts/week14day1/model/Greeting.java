package com.tts.week14day1.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Greeting {

    public Greeting() {
    }

    private Long id;
    private String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
