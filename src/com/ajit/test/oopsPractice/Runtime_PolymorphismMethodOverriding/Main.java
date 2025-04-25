package com.ajit.test.oopsPractice.Runtime_PolymorphismMethodOverriding;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new CIrcle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}
