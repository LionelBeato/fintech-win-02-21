package com.tts.day5;

import com.tts.day5.relationships.RockyPlanet;

public class Main {

    // abstract classes
    // 4 principles of OOP
        /*
        - polymorphism
        - encapsulation
        - inheritance
        - abstraction
        * */
    // all eagles inherit plumage

    public static void main(String[] args) {

        // below is how we instantiate RockyPlanet
        // note that "new RockyPlanet()" is directly
        // invoking the constructor
        RockyPlanet earth = new RockyPlanet();
        earth.setDistanceFromSun(96_000_000L);
        System.out.println("Here is the distance from the sun for Earth: "
                + earth.getDistanceFromSun());

        int x = 3;
        int y = 4;

        // i have two ways of adding the numbers above
        int z = x + y;
        // the method below is an example of abstraction
        // instead of writing out the functionality ourselves
        // we abstract it away
        System.out.println(Calculator.add(x, y));

        earth.doRotate();

    }

}
