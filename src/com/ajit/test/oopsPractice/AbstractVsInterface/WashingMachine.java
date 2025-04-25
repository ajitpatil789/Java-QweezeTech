package com.ajit.test.oopsPractice.AbstractVsInterface;

public class WashingMachine extends Appliance implements Switchable, Timer {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Starting washing machine cycle...");
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Washing machine is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " Washing machine is OFF");
    }

    @Override
    public void setTime(int minutes) {
        System.out.println("Timer set for " + minutes + " minutes");
    }
}
