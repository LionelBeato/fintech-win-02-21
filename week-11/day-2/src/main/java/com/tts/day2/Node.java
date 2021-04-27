package com.tts.day2;

public class Node {

    private int key;
    // keep in mind that classes are used as types as well
    // even though we're in the class Node,
    // we can still use it as a type for its fields
    private Node leftNode;
    private Node rightNode;

    public Node(int key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
