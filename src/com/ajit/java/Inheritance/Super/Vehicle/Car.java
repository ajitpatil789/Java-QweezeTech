package com.ajit.java.Inheritance.Super.Vehicle;

public class Car extends Vehicle {
    public String model;

    public Car(String model) {
        this.model = model;
    }

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Model = " + this.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}