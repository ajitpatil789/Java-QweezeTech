package com.ajit.test.oopsPractice.VehicleRentalSystem;

public class Bike extends Vehicle {
    public Bike(String brand, double pricePerDay) {
        super(brand, pricePerDay);
    }

    @Override
    void rent(int days) {
        System.out.println("Rented " + brand + " for RS. " + (pricePerDay * days));
    }
}
