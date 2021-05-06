package com.tts;

import com.tts.creational.factory.Notification;
import com.tts.creational.factory.NotificationFactory;
import com.tts.creational.factory.Policy;
import com.tts.creational.factory.PolicyFactory;
import com.tts.creational.singleton.SingletonClass;
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

        // creating an instance of NotificationFactory
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();

        PolicyFactory policyFactory = new PolicyFactory();
        Policy policy = policyFactory.createPolicy("internet",
                "05/06/2021",
                "One year",
                "1000 Dollars");


        System.out.println(policy);
      policy.renew();

    }





}
