package com.ajit.java.exceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] arr = new int[5];
            arr[10] = 5;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            try {
                String str = null;
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e1) {
                System.out.println(e1.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
