package com.ajit.java.loop.pattern.Pyramid;

import java.util.Scanner;

public class Pattern34Cross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for pattern size :");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for plus pattern");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1) {
//                    System.out.print("*");
                    System.out.print((char) ('A' + j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
