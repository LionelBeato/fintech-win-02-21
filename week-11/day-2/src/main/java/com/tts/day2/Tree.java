package com.tts.day2;

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
