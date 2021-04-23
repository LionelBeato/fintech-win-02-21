package com.tts.day5;

// once we extend Planet, we MUST implement all abstract methods
// if we dont want to implement,
// RockyPlanet must be abstract as well
// as it is, RockyPlanet is concrete
public class RockyPlanet extends Planet implements Rotatable {

    private Long distanceFromSun;
    private Atmosphere atmosphere;

    // setters and getters are an example of encapsulation
    // reason being is that we are wrapping access to the field
    // with methods that must be invoked

    public void setDistanceFromSun(Long distanceFromSun) {
        // keep in mind that this refers to the class instance
        // this is an example of databinding
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public Long getDistanceFromSun() {
        return distanceFromSun;
    }

    @Override
    public void doRotate() {
        System.out.println("This planet is rotating.");
    }
}
