package com.ajit.java.Array.testPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter element for delete");
        int deleteElement = scanner.nextInt();
        // find delete element
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == deleteElement) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Number not found");
        } else {
            int[] newArray = new int[arr.length - 1];
            int j = 0;
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
