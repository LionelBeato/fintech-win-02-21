package com.tts.day3.abs;

public class Guitar extends Instrument {

    // this is an optional override
    // you do not need to override it
    @Override
    public boolean isThisAnInstrument(boolean value){
       return false;
    }

    @Override
    public void createSound() {
        System.out.println("guitar go strum");
    }


}
