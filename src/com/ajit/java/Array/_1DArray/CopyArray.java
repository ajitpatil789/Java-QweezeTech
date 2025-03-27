package com.ajit.java.Array._1DArray;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] duplicate = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            duplicate[i] = arr[i];
        }
        System.out.println();
        System.out.println("Original Array :" + Arrays.toString(arr));
        System.out.println("Duplicate Array :" + Arrays.toString(duplicate));
    }
}
