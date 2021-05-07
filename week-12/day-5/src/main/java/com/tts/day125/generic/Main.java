package com.tts.day125.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Main {

    // you can extend a wild as well
    public void otherMethod(List<? extends B> lb) {
        B b = lb.get(0);
    }
    public static void handleNumbers(List<? extends Number> numbers) {
        System.out.println(numbers);
    }

    public static void printSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }

    public static void printSuperClassTwo(List<? super B> list) {
        System.out.println(list);
    }

    // this is acting as a regular method
    // but the return type is set up as a generic
    // meaning we can pass in the return type depending on the list argument
    public static <W> void printList(List<W> list) {
        for (W element: list) {
            System.out.println(element);
        }
    }

    // below is the wildcard ? generic
    // this acts similarly to utilizing a single named generic
    // however, it doesn't enforce types having to be the same
    // and you cannot return something that is of type ?
    public static void printCollection(Collection<?> c, Collection<?> d) {
        for (Object e : c) {
            System.out.println(e);
        }

        for (Object e : d) {
            System.out.println(e);
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

        printCollection(integerList, stringList);

        printSuperClass(Arrays.asList(1,2,3,4,5));
        // we can have a higher bound generic that will accept all legal parent classes
        // since object is a parent to integer and we are using the super keyword
        // the code below will resolve
        printSuperClass(Arrays.asList(new Object(), new Object()));
        printSuperClassTwo(Arrays.asList(new D(), new D()));

        // the generic is bound to all types of type Number
        // we can only use Number, Integer, Float, Double, Long...
//        handleNumbers(Arrays.asList("Hello"));

    }
}
