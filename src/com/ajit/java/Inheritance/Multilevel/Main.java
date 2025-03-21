package com.ajit.java.Inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark();// Defined in Dog
        dog.walk(); // Inherited from Mammal
    }
}
