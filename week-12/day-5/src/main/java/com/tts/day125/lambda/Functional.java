package com.tts.day125.lambda;

// this is a functionalinterface
// it can only have a single abstract method (SAM)
@FunctionalInterface
public interface Functional {

    void doSomething();

    // I cannot have two abstract methods inside of this interface
//    void doSomethingElse();

}
