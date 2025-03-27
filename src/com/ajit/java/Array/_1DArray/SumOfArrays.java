package com.ajit.java.Array._1DArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("You Entered: " + Arrays.toString(arr));
        System.out.println("Sum is : " + sum);
    }
}
