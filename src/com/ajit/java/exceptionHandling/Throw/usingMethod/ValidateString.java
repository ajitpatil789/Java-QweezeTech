package com.ajit.java.exceptionHandling.Throw.usingMethod;

public class ValidateString {
    public static void nullCheck(String name) throws NullStringException {
        if (name == null) {
            throw new NullStringException("Name can not be null");
        } else {
            System.out.println("Valid name : " + name);
        }
    }

    public static void main(String[] args) {
        String name = null;
        try {
            nullCheck(name);
        } catch (NullStringException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
