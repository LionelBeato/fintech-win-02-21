package com.tts.day2;

public class NestingDoll {

    private String name;
    private NestingDoll innerDoll;

    public NestingDoll(String name, NestingDoll innerDoll) {
        this.name = name;
        this.innerDoll = innerDoll;
    }

    public NestingDoll(String name) {
        this.name = name;
        innerDoll = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NestingDoll getInnerDoll() {
        return innerDoll;
    }

    public void setInnerDoll(NestingDoll innerDoll) {
        this.innerDoll = innerDoll;
    }

    @Override
    public String toString() {
        return "NestingDoll{" +
                "name='" + name + '\'' +
                ", innerDoll=" + innerDoll +
                '}';
    }


}
