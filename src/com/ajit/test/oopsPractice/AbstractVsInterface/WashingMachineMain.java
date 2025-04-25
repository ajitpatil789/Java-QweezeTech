package com.ajit.test.oopsPractice.AbstractVsInterface;

public class WashingMachineMain {
    public static void main(String[] args) {
        WashingMachine machine = new WashingMachine("Samsung");
        machine.turnOn();
        machine.setTime(30);
        machine.start();
        machine.turnOff();

    }
}
