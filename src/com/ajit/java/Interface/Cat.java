package com.ajit.java.Interface;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Roman eat chicken");
    }

    @Override
    public void sleep() {
        System.out.println("Roman sleep all the time");
    }

}
