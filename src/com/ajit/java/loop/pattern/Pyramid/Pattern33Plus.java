package com.ajit.java.loop.pattern.Pyramid;

import java.util.Scanner;

public class Pattern33Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for pattern size :");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for plus pattern");
            return;
        }

        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

