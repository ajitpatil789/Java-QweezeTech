package com.ajit.java.exceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            try {
                String str = null;
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            int[] arr = new int[5];
            arr[10] = 5;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
