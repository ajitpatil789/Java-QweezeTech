package com.ajit.java.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Male", 29);
        car.start();
        car.stop();
        System.out.println(car.add(10, 20));
        System.out.println(Vehicle.NAME);
        System.out.println(car);
    }
}
