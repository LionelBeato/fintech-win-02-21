package com.tts;

public class Dog extends Animal {

    private String breed;
    private String owner;
    private String givenName;


    public Dog(String breed, String owner, String givenName) {
        // if you are invoking super it must be
        // the first thing in your constructor
        super("dog", "woof");
        this.breed = breed;
        this.owner = owner;
        this.givenName = givenName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void doFetch() {
        System.out.println("This dog fetched!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", owner='" + owner + '\'' +
                ", givenName='" + givenName + '\'' +
                '}';
    }
}
