package com.tts.creational.factory;

public class AutoPolicy extends Policy {

    public AutoPolicy( String date, String duration, String rate) {
        super(date, duration, rate);
    }

    @Override
    public void renew() {
        System.out.println("renewing your auto policy");
    }

}
