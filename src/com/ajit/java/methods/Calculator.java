package com.ajit.java.methods;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int substraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();
        System.out.println("Addition: " + calculator.addition(100, 50));
        System.out.println("Substraction: " + calculator.substraction(100, 50));
        System.out.println("Multiplication: " + calculator.multiplication(100, 100));
        System.out.println("Division: " + calculator.division(100, 50));
    }
}
