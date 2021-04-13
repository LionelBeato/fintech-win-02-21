package com.tts;

import java.util.Scanner;

// all code in Java is inside of a class
// these classes are also going to be the blueprints
// for our objects later on
public class Main {

    // every legal java program has an entry point
    // the entry point is going to be your main method
    public static void main(String[] args) {

        // Here we are instantiating a new Scanner object
        // this object will be of type Scanner and will called called "input"
        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//        // this line captures our input and stores it as a variable
//        String firstName = input.nextLine();

        // there are many ways to print
        // including using printf() ... print format
//        System.out.println("Hello " + firstName);
        // %s is thought of as placeholder
        // it represents a string value that can be formatted into
        // out print out
        System.out.printf("Hello %s %s %s\n", "Leo", "Jose", "Beato");


        // println() is a method call not unlike
        // console.log() in javascript
        // Note that System is a class
        // unto itself, we will be exploring
        // built in classes later on
        // println will print with a new line
        System.out.println("Hello world!");

        // print() will simply just print, ignoring a new line
        // we can use \n to add a new line at the end of our string
        System.out.print("This is from a print method!\n");
        System.out.println("Neat, huh?");

        // not legal!
//        Circle.doPrint();

        // static call, completely legal!
        // whenever anything is static,
        // the reference will be italicised
//        Circle.doStaticPrint();

        char capitalK = 75;
        System.out.println(capitalK);

        long bigLong = 230L;
        float myfloat = 121.31f;
        long myLong = 1_000_000L;

        System.out.println("==== CASTING ====");

        byte b = (byte) 2321;
        System.out.println(b);

        int myInt = 6;
        int otherInt = 4;

        if (myInt > 5 && otherInt > 3) {
            System.out.println("Hello from a conditional!");
        } else {
            System.out.println("Hello from an else block!");

        }

        Circle myCircle = new Circle();
        Circle otherCircle = new Circle();
        Circle thirdCircle = new Circle();


        System.out.println(Circle.numberOfInstances);

        String myString = "Hello WIN cohort!";
        System.out.println("Length of myString: " + myString.length());
        System.out.println(myString.concat(" This is your instructor!"));
        System.out.println(myString.indexOf('W'));


        // this variable is not initialized
        // meaning it has no meaningful value
        String emptyString;

        // illegal variables names
//        String &hello;
//        String 1hello;
//        String int;

//        error! -> java: variable emptyString might not have been initialized
//        System.out.println(emptyString);



    }
}
