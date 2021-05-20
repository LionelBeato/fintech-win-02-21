package com.tts.simplewebproject.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {

    @Test
    public void simpleTest() {
        Sneaker sneaker = new Sneaker(1L, "red");
        System.out.println(sneaker);
    }

}