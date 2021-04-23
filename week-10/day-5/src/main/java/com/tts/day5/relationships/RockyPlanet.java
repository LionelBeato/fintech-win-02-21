package com.tts.day5.relationships;

import com.tts.day5.Planet;
import com.tts.day5.Rotatable;

// once we extend Planet, we MUST implement all abstract methods
// if we don't want to implement,
// RockyPlanet must be abstract as well
// as it is, RockyPlanet is concrete
public class RockyPlanet extends Planet implements Rotatable {

    private Long distanceFromSun;

    // below is an example of composition
    // Atmosphere's lifecycle is tied to RockyPlanet
    // and as such it cannot exist by itself
    // if RockyPlanet is destroyed, Atmosphere is destroyed
    //  we can say a RockyPlanet "has-a(n)" Atmosphere
    // this means there will be a field of type Atmosphere
    // on the class RockyPlanet
    class Atmosphere {

    }


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
