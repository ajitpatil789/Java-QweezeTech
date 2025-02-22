package com.ajit.java.loop;

public class ForLoop {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {             // Outer loop for rows
            for (int j = 1; j <= i; j++) {         // Inner loop for columns
                System.out.print("*" + " ");
            }
            System.out.println();                   // New line after each row
        }

    }
}
