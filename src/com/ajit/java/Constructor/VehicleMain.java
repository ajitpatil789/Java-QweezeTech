package com.ajit.java.Constructor;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Toyota", "camry");
        Vehicle v3 = new Vehicle("Honda", "Civic", 2023);
        Vehicle v4 = new Vehicle("BMW", "X5", 2024, "Black");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}
