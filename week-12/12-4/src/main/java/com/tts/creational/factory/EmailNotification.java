package com.tts.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {

        System.out.println("Sending an email notification");

    }

    protected EmailNotification() {

    }

}
