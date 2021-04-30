package com.tts.day5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }



    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a number.");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        try {
            // here we attempt any code we want to run
            // that may throw an exception
            System.out.println("Hello, I'm in a try block!");
            throw new Exception("Please stop doing that...");
//            System.out.println("This code can't be reached :(!");
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } catch(Exception e){
            // if an exception is thrown
            // we can catch it and resolve code in this block
            e.printStackTrace();
            System.out.println("Hello from a catch block!");
        } finally {
            System.out.println("This is in a finally block!");
        }

        System.out.println("This is outside of my try-catch block.");

//        System.out.println(divide(5, 0));
//        System.out.println(divideLBYL(5, 0));
//        System.out.println(divideEAFP(5, 0));

        int x = getInt();
        System.out.println("x is " + x);



    }
}
