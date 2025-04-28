package com.ajit.test.oopsPractice.VehicleRentalSystem;

public class Car extends Vehicle {
    public Car(String brand, double pricePerDay) {
        super(brand, pricePerDay);
    }

    @Override
    void rent(int days) {
        System.out.println("Rented " + brand + " for RS. " + (pricePerDay * days));
    }

}
