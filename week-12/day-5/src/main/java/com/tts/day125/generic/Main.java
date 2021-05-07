package com.tts.day125.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    // this is acting as a regular method
    // but the return type is set up as a generic
    // meaning we can pass in the return type depending on the list argument
    public static <W> void printList(List<W> list) {
        for (W element: list) {
            System.out.println(element);
        }
    }

    public static <T> T returnValue(T myValue) {
        return myValue;
    }

    public static <T extends Comparable<T>> int greaterThan(T[] numArray, T element) {
        int count = 0;
        for (T e : numArray) {
            if (e.compareTo(element) > 0) ++count;
        }

        return count;
    }

    public static <T, R> void printTwoGenerics(T x, R y) {
        System.out.println(x + " : " + y);
    }

    public static void main(String[] args) {

        // this is how we instantiate an arraylist
        // take note of the generic in the diamond <>
        // we use this generic to define a type in the interface List
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(45);
        integerList.add(3);
        integerList.add(645);

        //
        List rawList = new ArrayList<>();


        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("from");
        stringList.add("a");
        stringList.add("generic");


        printList(integerList);
        printList(stringList);


        System.out.println(returnValue("Hello"));
        System.out.println(returnValue(4000));

        printTwoGenerics(2000L, "this is a string omg");

        GenericClass<Integer> myGenericClass = new GenericClass<>(3, "Bob");

    }
}
