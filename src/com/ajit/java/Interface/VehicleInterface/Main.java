package com.ajit.java.Interface.VehicleInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop(); // Using default method
        Vehicle.service();   // Using static method from the interface
        System.out.println();
        System.out.println();
        bike.start();
        bike.stop();
    }
}
