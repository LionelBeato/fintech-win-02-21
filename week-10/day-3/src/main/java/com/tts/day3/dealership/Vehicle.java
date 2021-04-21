package com.tts.day3.dealership;

public class Vehicle {

    // private is considered best practice for an access modifier
    // VehicleClassification is an enum type
    private VehicleClassification vehicleClassification;

    public VehicleClassification getVehicleClassification() {
        return vehicleClassification;
    }

    public void setVehicleClassification(VehicleClassification vehicleClassification) {
        this.vehicleClassification = vehicleClassification;
    }

    //    public int wheels = 4;

    // a vehicle can drive
    // start its engine
    // these behaviors can be described as methods

}
