package com.tts.day3;

public class Bike implements Driveable {

    public int speed;
    public int gear;

    // whenever we have filled methods
    // in class, those methods are "concrete"
    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void accelerate(int a) {
        speed = speed + a;
    }

    @Override
    public void brake(int a) {
        speed = speed - a;
    }

    public void displayStatus() {
        System.out.println(
                "Speed: " + speed
                + " Gear: " + gear
        );
    }

}
