package com.tts.day2;

// below is an example of a class that is
// using itself as a field type
// this may seem a bit confusing but its completely legal
public class Tree {

    private String name;
    private String leaf;
    private Tree tree;

    public Tree(String name, String leaf, Tree tree) {
        this.name = name;
        this.leaf = leaf;
        this.tree = tree;
    }

    public Tree() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", leaf='" + leaf + '\'' +
                ", tree=" + tree +
                '}';
    }
}
