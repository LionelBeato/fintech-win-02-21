package com.tts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void nestedFors() {
        outer:
        for(int i = 0; i < 10; i++) {

            System.out.println("index of outer loop: " + i);

            inner:
            for(int j = 1; i < 10; j++) {

                System.out.println("index of inner loop: " + j);

                if (j % 2 == 0) {
                    break outer;
                }

            }
        }
    }

    public static void loopAndBreak(){
        Random random = new Random();
        int breakAt = random.nextInt(30);
        int breakAtTwo = random.nextInt(30);


        for(int i = 0; i < 100; i++) {
            if (i == breakAt) {
                System.out.println("Random number was "+ breakAt);
                break;
            }

            if (i != 0 && i % 2 == 0) {
                continue;
            }

            System.out.println("At index: " + i);
        }
        System.out.println("After the for loop...");
    }


    public static String returnArg(String arg){
        return arg;
    }

    public static int returnNum(int arg){
        return arg;
    }

    public static void returnNothing(){
        System.out.println("This method does not return a value.");
//        return;
    }

    public static void printShirtSize(char shirt) {
        String msg = "";
        switch(shirt) {
            case 's':
                msg = "Shirt is small";
                break;
            case 'm':
                msg = "Shirt is medium";
                break;
//            case 's' -> msg = "Shirt is small";
//            case 'm' -> msg = "Shirt is medium";
        }
        System.out.println(msg);
    }

    public static void checkId(boolean validId, int age, boolean buyingAlc) {
        // the first if statements checks for a valid id
        if (validId) {
            // id is valid, rest of the code resolves
            System.out.println("Valid Id presented!");
            // check to see if customer is at least 21
            // and they are buying alcohol
            if ((age>=21) && buyingAlc) {
                System.out.println("Customer legal to buy alcohol");
            } else {
                System.out.println("No alcohol for you!");
            }
        } else {
            System.out.println("Error: invalid ID!");
        }
    }

    public static void main(String[] args) {

        boolean myBool = true;

        if(myBool) {
            System.out.println("Hello from a conditional!");
        }

        int count = 30;

        if (count > 20) {
            String msg = "count is large!";
//            System.out.println(msg);

            if (count > 40) {
                // as long as count is less than 40
                // the variable msg is never mutated
                msg = msg + "\ncount is VERY large!";
            }
            System.out.println(msg);
        }

        checkId(true, 24, true);

        int myInt = 30;

        if (myInt > 20) System.out.println("This is from a one-liner if statement!");


        int bigInt = 54;

        if (bigInt > 80) {
            System.out.println("That number is really big!");
        } else if (bigInt > 60) {
            System.out.println("That number is fairly big");
        } else if (bigInt > 30) {
            System.out.println("That number is alright...");
        } else {
            System.out.println("That number is kinda small...");
        }

        printShirtSize('m');

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop number: "+ i + "\nI am in a for loop!");
        }

        for (int i = 20; i > 0; i--) {
            System.out.println("Counting down! " + i);
        }


//        for (;;){
//            System.out.println("This will go on forever");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int inputNumber = scanner.nextInt();

        List<Integer> myList = new ArrayList<>();
//        int[] myArray = {1, 44, 53, 53};
        myList.add(1);
        myList.add(432);
        myList.add(321);
        myList.add(inputNumber);

        for (Integer element : myList) {
            System.out.println("This is my element: " + element);
        }

        while (myBool) {
            System.out.println("Hello from inside a while loop!");
            myBool = false;
        }

        do {
            System.out.println("Hello from inside a do-while loop!");
        } while (myBool);

       String returnValue = returnArg("This is from a return statement inside of a method!");
       System.out.println(returnValue);
       returnNothing();

       loopAndBreak();
       nestedFors();
    }
}
