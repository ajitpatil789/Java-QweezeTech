package com.ajit.java.Interface;

public interface Animal {
    String NAME = "Roman";

    void eat();

    void sleep();

    default void display() {
        System.out.println("default method......");
    }
}
