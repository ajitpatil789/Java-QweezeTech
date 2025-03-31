package com.ajit.java.exceptionHandling.Throw.usingMethod;

import com.ajit.java.exceptionHandling.Throw.AgeException;

public class AgeValidationUsingMethod {
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be greater than 18");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try {
            validateAge(14);
        } catch (AgeException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
