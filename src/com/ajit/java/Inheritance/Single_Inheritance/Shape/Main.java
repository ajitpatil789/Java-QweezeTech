package com.ajit.java.Inheritance.Single_Inheritance.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw(); // Calls overridden method
        System.out.println("Area of circle : " + circle.getArea());
    }
}
