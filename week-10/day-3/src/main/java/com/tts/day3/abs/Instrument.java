package com.tts.day3.abs;

public abstract class Instrument {

    public boolean isThisAnInstrument(boolean value) {
        return value;
    }

    // this method is abstract
    // meaning that wherever its inherited
    // it needs a unique implementation
    // think of abstract methods as a contract
    public abstract void createSound();

}
