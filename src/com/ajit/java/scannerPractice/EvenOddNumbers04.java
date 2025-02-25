package com.ajit.java.scannerPractice;

public class EvenOddNumbers04 {
    public static void main(String[] args) {
        // Print Even and odd numbers from 1 to 50
        System.out.print("Even Numbers: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
