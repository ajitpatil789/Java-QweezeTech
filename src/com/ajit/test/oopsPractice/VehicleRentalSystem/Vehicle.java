package com.ajit.test.oopsPractice.VehicleRentalSystem;

public abstract class Vehicle {
    String brand;
    double pricePerDay;

    public Vehicle(String brand, double pricePerDay) {
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    abstract void rent(int days);
}
