package com.ajit.test.oopsPractice.Runtime_PolymorphismMethodOverriding;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        //super.draw();
        System.out.println("Drawing Rectangle");
    }
}
