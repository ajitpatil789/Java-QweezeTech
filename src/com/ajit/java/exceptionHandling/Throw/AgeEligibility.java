package com.ajit.java.exceptionHandling.Throw;

public class AgeEligibility {

    public static void checkEligibility(int age, int weight) throws AgeException {
        if (age < 12 && weight < 40) {
            throw new AgeException("Student age must be greater than 12 and weight is greter than 40");
        } else {
            System.out.println("Entries valid..");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(10, 30);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
