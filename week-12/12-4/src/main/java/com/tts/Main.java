package com.tts;

import com.tts.creational.SingletonClass;
import com.tts.structural.adapter.BirdAdapter;
import com.tts.structural.adapter.Sparrow;
import com.tts.structural.adapter.ToyDuck;

public class Main {

    public static void main(String[] args) {

//        SingletonClass mySingleton1 = new SingletonClass();
//        SingletonClass mySingleton2 = new SingletonClass();
//        SingletonClass mySingleton3 = new SingletonClass();
        SingletonClass mySingleton = SingletonClass.getInstance();
        System.out.println(mySingleton.getMessage());

        Sparrow sparrow = new Sparrow();
//        Ostrich ostrich = new Ostrich();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        // we are adapting bird to toyduck
        // this squeak method will not result in "squeak"
        // it'll instead call the bird's makeSound method
        birdAdapter.squeak();

    }

}
