package com.ajit.test.oopsPractice.AbstractVsInterface;

public abstract class Appliance {
    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    abstract void start();
}
