package com.ajit.java.Interface;

public interface Bird {
    String NAME = "BIRD";

    void makeSound();

    void fly();

    default void birdDefault() {                // Concrete methods with default keyword
        System.out.println("Default method for bird interface");
    }
}
