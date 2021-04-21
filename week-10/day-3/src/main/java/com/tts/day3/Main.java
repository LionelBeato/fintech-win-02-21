package com.tts.day3;

import com.tts.day3.abs.Guitar;
import com.tts.day3.abs.Shoe;
import com.tts.day3.abs.Trumpet;
import com.tts.day3.abs.WingTips;

// a class is a blueprint to create an object
// an object is going to be an instance of class
public class Main {

    // entrypoint
    public static void main(String[] args) {
        // make an instance of vehicle
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.wheels);

        Guitar myGuitar = new Guitar();
        Trumpet myTrumpet = new Trumpet();

        myGuitar.createSound();
        myTrumpet.createSound();

        // inner abstract anonymous class
        Shoe boots = new Shoe() {
            @Override
            public void getLaces() {
                System.out.println("you haven nice laces");
            }
        };

        WingTips wingTips = new WingTips();
        wingTips.getLaces();
        boots.getLaces();

    }

}
