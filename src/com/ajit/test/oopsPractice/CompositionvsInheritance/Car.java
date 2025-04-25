package com.ajit.test.oopsPractice.CompositionvsInheritance;

public class Car {
    Engine engine;

    public Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
