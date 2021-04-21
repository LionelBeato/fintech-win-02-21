package com.tts.day3;

import com.tts.day3.abs.Guitar;
import com.tts.day3.abs.Shoe;
import com.tts.day3.abs.Trumpet;
import com.tts.day3.abs.WingTips;
import com.tts.day3.dealership.LightTruck;
import com.tts.day3.dealership.Vehicle;
import com.tts.day3.dealership.VehicleClassification;
import com.tts.day3.enumeration.Day;
import com.tts.day3.enumeration.EnumTest;

// a class is a blueprint to create an object
// an object is going to be an instance of class
public class Main {

    // entrypoint
    public static void main(String[] args) {
        // make an instance of vehicle
        Vehicle myVehicle = new Vehicle();
//        System.out.println(myVehicle.wheels);

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


        EnumTest weekday = new EnumTest(Day.MONDAY);
        weekday.weekendOrWeekday();

        LightTruck myLightTruck = new LightTruck(true);
//        myLightTruck.transferCase.setNumGears(4);
        System.out.println(myLightTruck.transferCase.getNumGears());

        myLightTruck.setVehicleClassification(VehicleClassification.NEW);


    }

}
