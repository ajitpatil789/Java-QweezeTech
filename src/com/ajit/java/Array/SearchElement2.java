package com.ajit.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(String.format("Enter %d elements", n));
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("You Entered : " + Arrays.toString(arr));
        System.out.print("Enter the Search number : ");
        int search = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println(String.format("Number %d is found", arr[i]));
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Number is not found");
        }

    }
}