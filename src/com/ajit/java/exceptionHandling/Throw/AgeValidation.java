package com.ajit.java.exceptionHandling.Throw;

public class AgeValidation {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new AgeException("Age is not valid");
            }
            System.out.println("Age is valid.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
