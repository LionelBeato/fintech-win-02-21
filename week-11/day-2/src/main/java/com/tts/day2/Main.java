package com.tts.day2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int addUntilTen(int x){
        x = x + 1;
        System.out.println(x);

        if (x == 10) {
            return x;
        }

       return addUntilTen(x);
    }


    public static void main(String[] args) {
        Tree childTree = new Tree("Oak", "21", new Tree());
        Tree myTree = new Tree("Birch", "30", childTree);

        System.out.println(myTree.getTree());

        NestingDoll fatherDoll = new NestingDoll("Father");
        NestingDoll motherDoll = new NestingDoll("Mother");
        NestingDoll childDoll = new NestingDoll("Child");

        fatherDoll.setInnerDoll(childDoll);
        motherDoll.setInnerDoll(fatherDoll);

        System.out.println(motherDoll);

        BinaryTree binaryTree = new BinaryTree();

        int[] nodes = {3 ,2, 4, 10, 1, 7, 11};

        for (int n: nodes) {
            binaryTree.add(n);
        }

        System.out.println(binaryTree);

        BinaryHeap binaryHeap = new BinaryHeap();
        int[] nodesHeap = {1, 12, 3, 24, 7};

        for (int n: nodesHeap) {
            binaryHeap.heap.add(n);
        }

        System.out.println(binaryHeap);

        List<Shoe> shoePair = new ArrayList<>();

        Shoe leftShoe = new Shoe();
        leftShoe.setBrand("Nike");
        Shoe rightShoe = new Shoe();
        rightShoe.setBrand("Nike");

        leftShoe.setSiblingShoe(rightShoe);
//        rightShoe.setSiblingShoe(leftShoe);

        shoePair.add(leftShoe);
        shoePair.add(rightShoe);

        System.out.println(shoePair);

        addUntilTen(0);



    }
}
