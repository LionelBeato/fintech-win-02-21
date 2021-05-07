package com.tts.day125.lambda;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        // this is an anonymous inner class
        // myFunctional is the variable reference name
        Functional myFunctional = new Functional() {
            @Override
            public void doSomething() {
                System.out.println("This is an an anonymous class");
            }
        };

        Functional myOtherFunctional = new FunctionalImpl();

        List<Integer> myList = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return null;
            }

            @Override
            public Integer set(int index, Integer element) {
                return null;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        Functional myLambdaFunctional = () -> System.out.println("This is an an anonymous class");
        OtherFunctional otherLambda = (x, y) -> {
            System.out.println("I'm inside a multi-parameter lambda");
           return x + y;
        };


        System.out.println(otherLambda.operation(5,3));

        SmallFunctional smallFunctional = message -> System.out.println(message);

        smallFunctional.smallPrint("Hello from a small lambda");

        SmallFunctional smallMethodReference = System.out::println;

        smallMethodReference.smallPrint("Hello from a method reference");

        List<Integer> myIntegerList = Arrays.asList(3,4,1,89,72);

        // filter and forEach are whats known as higher order functions
        myIntegerList.stream()
                .filter(e -> e > 5)
                .forEach(e -> System.out.println(e));

        myIntegerList.stream()
                .map(e -> e + 1)
                .forEach(System.out::println);

    }
}

class FunctionalImpl implements Functional {

    @Override
    public void doSomething() {

    }
}
