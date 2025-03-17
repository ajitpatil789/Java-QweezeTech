package com.ajit.java.Encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "S458");
        car.setPrice(8000000);
        System.out.println(car);
    }
}
