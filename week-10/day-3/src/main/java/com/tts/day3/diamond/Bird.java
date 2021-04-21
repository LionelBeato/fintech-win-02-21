package com.tts.day3.diamond;

public class Bird implements Speakable, Flyable {

    @Override
    public void doSpeak() {
        System.out.println("Tweet tweet tweet");
    }

    @Override
    public void doFly() {
        System.out.println("This animal flew");
    }
}
