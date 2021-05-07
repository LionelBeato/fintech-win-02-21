package com.tts.day125.generic;

public class GenericClass <T> {

    private T generic;
    private String name;

    public GenericClass(T generic, String name) {
        this.generic = generic;
        this.name = name;
    }

    public T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "generic=" + generic +
                ", name='" + name + '\'' +
                '}';
    }
}
