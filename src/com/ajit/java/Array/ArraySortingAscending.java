package com.ajit.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Array of size n

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {          // Loop for selecting each element
            for (int j = i + 1; j < n; j++) {  // Loop for comparing with the rest of the elements
                if (arr[i] > arr[j]) {         // Swap if the current element is greater than the next
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array using Bubble sort: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array using Arrays.toString " + Arrays.toString(arr));
    }
}