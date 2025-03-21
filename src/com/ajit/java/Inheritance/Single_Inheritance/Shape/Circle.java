package com.ajit.java.Inheritance.Single_Inheritance.Shape;

public class Circle extends Shape {
    // derived class inheriting from Shape
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Overriding draw method
    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
