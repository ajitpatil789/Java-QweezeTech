package com.ajit.java.Inheritance.Single_Inheritance.Animal;

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog bark");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Derived Class : Eat as well as bark");
    }
}
