package com.ajit.java.Interface;

public interface Animal {
    String NAME = "Roman";

    void eat();

    void sleep();

    default void display() {
        System.out.println("default method......");
        animalProperties("Animal Properties");
    }

    static void animalStatic() {        // Static methods with a body
        System.out.println("we can use static method in interface");
    }

    private void animalProperties(String message) {
        System.out.println(message);

    }
}
