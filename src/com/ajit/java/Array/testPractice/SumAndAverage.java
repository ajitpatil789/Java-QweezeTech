package com.ajit.java.Array.testPractice;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        double sum = 0;
        for (int add : arr) {
            sum += add;
        }
        System.out.println("Sum is : " + sum);
        double avg = sum / arr.length;
        System.out.println("Average is : " + avg);
    }
}
