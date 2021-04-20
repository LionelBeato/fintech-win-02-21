package com.tts;

public class Person {

    // a person can have a height
    // a person can have an eye color

    // a person has the following
    // a name
    // an age
    // a location

    // these are referred to as fields
    // also called "members" or "class variables" or "properties"
    private String name;
    private int age;
    private String location;

    // you can think of the constructor as a special method
    // beware that it is not technically a method however
    // calling it a method is something of a shorthand
    // this constructor is parameterized
    // which means we can pass arguments into it
    public Person (String name, int age, String location) {
        // below is an example of databinding
        // databinding means we can bind one piece of data with another
        // the value of the String name argument will be tied to the instance variable

        // keep in mind that "this" refers to the instance of your class
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person (String name) {
        this.name = name;
    }

    // this can be referred to as an empty constructor
    // and the noargs constructor
    // all classes have a default constructor
    public Person() {

    }

    // Methods allow us to describe the behavior of our objects

    public void sayHello() {
        // for every instance this print out will be unique
        // specifically because of the instance variable name
        System.out.println("Hello "+ name);
    }

    public int birthday(){
        return age + 1;
    }

    // methods can come in many forms
    // below we have a method with parameters than will return
    // when a person was actually born
    public int birthYear( int currentYear) {
        // birthday is whats known as a local variable
        // they are only usable within the scope of this method
        // local variables in modern versions of java
        // can be declared with the keyword var
//        var birthday = currentYear - age;
        int birthday = currentYear - age;
        return birthday;
    }

    // getters and setters are traditional methods
    // they are not hard coded patterns in Java

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

}

