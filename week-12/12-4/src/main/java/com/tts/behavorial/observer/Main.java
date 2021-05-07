package com.tts.behavorial.observer;

// code is taken from this example: https://www.baeldung.com/java-observer-pattern

public class Main {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());
    }

}
