package com.tts.structural.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("setting temp...");
    }

    public void run() {
        System.out.println("starting cooling controller...");

    }

    public void cool(int maxAllowedTemp) {
        System.out.println("cooling...");

    }

    public void stop() {
        System.out.println("starting cooling controller...");
    }
}
