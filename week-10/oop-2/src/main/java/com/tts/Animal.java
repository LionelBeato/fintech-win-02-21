package com.tts;

public class Animal {

    private String name;
    private String cry;

    public Animal(String name, String cry) {
        this.name = name;
        this.cry = cry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    private void test() {
        System.out.println("this is a test");
    }

}
