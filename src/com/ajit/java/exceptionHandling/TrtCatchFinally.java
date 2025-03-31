package com.ajit.java.exceptionHandling;

public class TrtCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block executed");
        }
        int[] arr = {1, 2, 3, 4};
        try {
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        String str = null;
        try {
            System.out.println(str.toUpperCase());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
