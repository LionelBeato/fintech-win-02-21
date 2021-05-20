package com.tts.simplewebproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// every class inherits methods from the parent class Object
@Entity
public class Sneaker {

    // here we're using long
    // because it allows to store a large amount of IDs
    // its the wrapper version of long
    // we have access to helper methods that live on Long.java
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;

    public Long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }

    public Sneaker(String color) {
        this.color = color;
    }

    public Sneaker() {}
}
