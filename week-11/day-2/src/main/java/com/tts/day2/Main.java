package com.tts.day2;

public class Main {

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

    }
}
