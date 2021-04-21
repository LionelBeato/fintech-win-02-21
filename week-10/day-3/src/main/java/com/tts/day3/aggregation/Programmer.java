package com.tts.day3.aggregation;

public class Programmer {

    public String name;
    // this defines a HAS-A relationship
    // keep in mind that whenever you make a class
    // you are also allowing yourself to create a type
    public Address programmerAddr;

    public Programmer(String name, Address address) {
        this.name = name;
        this.programmerAddr = address;
    }

}
