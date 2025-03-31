package com.ajit.java.exceptionHandling;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block executed...");
            String str = null;
            try {
                System.out.println(str.charAt(1));
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
