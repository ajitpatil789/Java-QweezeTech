package com.ajit.java.scannerPractice;

import java.util.Scanner;

public class FibonacciSeries02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        int first = 0;
        int second = 1;
        int result;
        System.out.print("Fibonacci Series: " + first + ", " + second);
        for (int i = 2; i < num; i++) {
            result = first + second;
            System.out.print(", " + result);
            first = second;
            second = result;
        }
    }
}
