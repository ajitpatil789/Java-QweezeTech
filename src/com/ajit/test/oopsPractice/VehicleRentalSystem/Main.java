package com.ajit.test.oopsPractice.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bike("Splender", 200);
        Vehicle v2 = new Car("Swift", 500);
        v1.rent(5);
        v2.rent(2);
    }
}
