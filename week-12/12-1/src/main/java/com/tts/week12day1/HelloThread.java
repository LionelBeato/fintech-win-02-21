package com.tts.week12day1;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from a custom thread class!");
    }

}
