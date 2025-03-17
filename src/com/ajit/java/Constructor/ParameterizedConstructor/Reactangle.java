package com.ajit.java.Constructor.ParameterizedConstructor;

public class Reactangle {
    private double length;
    private double width;

    public Reactangle() {
        System.out.println("Default constructor");
    }

    public Reactangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public void display() {
        System.out.println("Lenth: " + length);
        System.out.println("Width : " + width);
        System.out.println("Area of Reactangle : " + calculateArea());
    }


    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle(20, 50);
        reactangle.display();
    }
}
