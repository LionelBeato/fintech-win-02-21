package com.tts.day2;

public class Shoe {

    private String brand;
    private String laceType;
    private Shoe siblingShoe;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLaceType() {
        return laceType;
    }

    public void setLaceType(String laceType) {
        this.laceType = laceType;
    }

    public Shoe getSiblingShoe() {
        return siblingShoe;
    }

    public void setSiblingShoe(Shoe siblingShoe) {
        this.siblingShoe = siblingShoe;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", laceType='" + laceType + '\'' +
//                ", siblingShoe=" + siblingShoe.getBrand() +
                '}';
    }
}
