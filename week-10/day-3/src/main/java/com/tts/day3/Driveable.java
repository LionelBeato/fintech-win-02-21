package com.tts.day3;

public interface Driveable {
    // this is my driveable interface
    // for most if not all vehicles
    // anything that can driven will
    // implement this interface

    // these methods do not have a body
    // methods in interfaces do not have implementations
    // these methods are referred to as "abstract"
    void changeGear(int a);
    void accelerate(int a);
    void brake(int a);

}
