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

    public void printVehicleType() {
        String type;
        switch (this.vehicleClassification) {
            case NEW:
                type = "New Car";
                break;
            case USED:
                type = "Used Car";
                break;
            case OFF_LEASE:
                type = "Leased Car";
                break;
            case SHUTTLE:
                type = "Dealer Shuttle";
                break;
            case LOANER:
                type = "Dealer Service Loaner";
                break;
            case PARTS_RUNNER:
                type = "Parts runner";
                break;
            default:
                type = "NOT SET";
                break;
        }
        System.out.println("This car type is: " + type);
    }
}
