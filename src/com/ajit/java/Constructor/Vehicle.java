package com.ajit.java.Constructor;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Vehicle() {
        this("unknown", "unknown", 2024, "White");
    }

    public Vehicle(String brand, String model) {
        this(brand, model, 2024, "White");
    }

    public Vehicle(String brand, String model, int year) {
        this(brand, model, year, "White");
    }

    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
