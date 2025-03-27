package com.ajit.java.Array._1DArray;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("You entered :" + Arrays.toString(arr));
        System.out.println("Enter the number You want to delete");
        int deleteElement = scanner.nextInt();
        // Check if the element exists
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == deleteElement) {
                index = i;
                break;
            }
        }
//        System.out.println(index);
        // If element is not found
        if (index == -1) {
            System.out.println("Element is not found");
        } else {
            // Creating a new array with one less size
            int j = 0;
            int[] newArray = new int[n - 1];
            // Copying elements except the deleted one
            for (int i = 0; i < n; i++) {
                if (i != index) {
                    newArray[j] = arr[i];
                    j++;
                }
            }
            System.out.println("Updated Array: " + Arrays.toString(newArray));
        }

    }
}
