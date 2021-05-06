package com.tts.creational.factory;

public class InternetPolicy extends Policy {

    public InternetPolicy(String date, String duration, String rate) {
        super(date, duration, rate);
    }

    @Override
    public void renew() {
        System.out.println("renewing your internet policy");
    }

}
