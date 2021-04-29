package com.tts.day4;

public class Main {


    public static void displaySum(int a, int b) {
        System.out.println(a + b);
    }

    // this algorithm has a big O of O(1)
    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    // this algorithm has a big O of O(n)
    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }

    public static void printAllPossibleOrderedPairs(int[] items) {
        for ( int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }

    public static void sayHiNTimes(int n){
        for (int i = 0; i < n; i ++) {
            System.out.println("hi");
        }
    }

    public static int getLargestItem(int[] items) {
        int largest = Integer.MIN_VALUE;
        for (int item : items) {
            if ( item > largest) {
                largest = item;
            }
        }
        return largest;
    }


    public static void main(String[] args) {

        System.out.println("\n***** displaySum *****");

        displaySum(3, 7);

        int[] intArr = {1, 2, 3 , 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\n***** printFirstItem *****");

        printFirstItem(intArr);

        System.out.println("\n***** printAllItems *****");

        printAllItems(intArr);

        System.out.println("\n***** printAllPossibleOrderedPairs *****");

        printAllPossibleOrderedPairs(intArr);

        System.out.println("\n***** sayHiNTimes *****");

        sayHiNTimes(50);
    }

}
