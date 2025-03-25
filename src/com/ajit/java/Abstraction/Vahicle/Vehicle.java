package com.ajit.java.Abstraction.Vahicle;

abstract public class Vehicle {
    public static final String NAME = "Ajit";
    String gender;
    int age;

    public Vehicle(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    abstract void start();

    abstract int add(int a, int b);

    public void stop() {
        System.out.println("Stop Vehicle");
    }

}
