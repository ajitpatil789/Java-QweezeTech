package com.ajit.java.exceptionHandling.Throw;

public class Throw {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("You are eligible to vote");
    }
}
