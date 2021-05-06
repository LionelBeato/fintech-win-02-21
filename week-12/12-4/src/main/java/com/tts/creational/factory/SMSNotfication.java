package com.tts.creational.factory;

public class SMSNotfication implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");

    }
}
