package com.tts.structural.facade;

//code from here:
public class Main {

    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();

        // instead of invoking a slew of subsystem methods, we can instead use two methods
        // this is an example of encapsulation and abstraction
        facade.startEngine();
        facade.stopEngine();
    }
}
