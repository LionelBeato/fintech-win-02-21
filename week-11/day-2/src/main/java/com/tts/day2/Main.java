package com.tts.day2;

public class Main {

    public static void main(String[] args) {
        Tree childTree = new Tree("Oak", "21", new Tree());
        Tree myTree = new Tree("Birch", "30", childTree);

        System.out.println(myTree.getTree());
    }
}
