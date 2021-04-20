package com.tts;

public class Fish extends Animal {

    private boolean isScaled;
    private boolean isFresh;

    public Fish(String name, String cry) {
        super(name, cry);
    }

    public void doSwim() {
        System.out.println("this fish swam");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "isScaled=" + isScaled +
                ", isFresh=" + isFresh +
                '}';
    }
}
