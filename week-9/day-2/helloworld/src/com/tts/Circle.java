package com.tts;

public class Circle {

    public static int numberOfInstances = 0;

    public void doPrint() {
        System.out.println("Hello from the Circle class!");
    }
    public static void doStaticPrint() {
        System.out.println("Hello from the Circle class!");
    }

    public Circle() {
        numberOfInstances++;
    }
}
