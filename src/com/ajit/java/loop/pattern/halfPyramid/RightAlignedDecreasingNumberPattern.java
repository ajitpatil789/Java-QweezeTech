package com.ajit.java.loop.pattern.halfPyramid;

public class RightAlignedDecreasingNumberPattern {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for right alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the decreasing number for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(n - i + 1);
            }
            System.out.println();

        }
       
    }
}
