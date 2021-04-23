package com.tts.day5;

// i don't want to instantiate Planet
// but i do want to use in the chain of inheritance
public abstract class Planet {

    // if a class has an abstract method
    // it needs to be declared abstract
    // this method is only defined and its not implemented
    // that means that we have the signature but no body
    public abstract Long getDistanceFromSun();

}
