package com.ajit.java.Interface;

public class CrowAndCow implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Both Animal and Bird can eat foods");
    }

    @Override
    public void sleep() {
        System.out.println("Both Animal and Bird can sleep");

    }

    @Override
    public void makeSound() {
        System.out.println("Both Animal and Bird can make different sound");

    }

    @Override
    public void fly() {
        System.out.println("Only Bird can able to fly");

    }

    @Override
    public void display() {
        //Animal.super.display();
        System.out.println("Animal NAME: " + Animal.NAME);
        System.out.println("Bird NAME: " + Bird.NAME);

    }
}
