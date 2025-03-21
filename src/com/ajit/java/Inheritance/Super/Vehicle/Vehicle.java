package com.ajit.java.Inheritance.Super.Vehicle;

public class Vehicle {
    public String brand;
    public int year;

    // Added default constructor
    public Vehicle() {
        this("Unknown", 2024);
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }


    public void display() {
        System.out.println("Brand = " + this.brand);
        System.out.println("Year = " + this.year);
    }
}