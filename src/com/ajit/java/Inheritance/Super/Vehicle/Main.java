package com.ajit.java.Inheritance.Super.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2025, "Model S"); // Added the missing model parameter
        System.out.println(car);
        car.display();
    }
}