package com.tts.creational.factory;

public class PolicyFactory {

    public Policy createPolicy(String type, String date, String duration, String rate) {
        if ( type == null || type.isEmpty()) {
            return null;
        }

        if (type.equalsIgnoreCase("AUTO")) {
            return new AutoPolicy(date, duration, rate);
        } else if (type.equalsIgnoreCase("INTERNET")) {
            return new InternetPolicy(date, duration, rate);
        }
        return null;

    }

}
