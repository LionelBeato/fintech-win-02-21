package com.tts.day2;

public class BinaryTree {

    Node root;

    public Node insertNode(Node current, int key) {
        if (current == null) {
            return new Node(key);
        } else if (key < current.getKey()) {
            current.setLeftNode(insertNode(current.getLeftNode(), key));
        } else if (key > current.getKey()) {
            current.setRightNode(insertNode(current.getRightNode(), key));
        } else {
            return current;
        }
        return current;
    }

    public void add(int key) {
        root = insertNode(root, key);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
