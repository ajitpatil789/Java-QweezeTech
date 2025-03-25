package com.ajit.java.Abstraction.Vahicle;

public class Car extends Vehicle {
    public Car(String gender, int age) {
        super(gender, age);
    }

    @Override
    void start() {
        System.out.println("Car Stop");
    }

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Tesala Stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
