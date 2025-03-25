package com.ajit.java.Interface;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat chicken");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleep");
    }
}
