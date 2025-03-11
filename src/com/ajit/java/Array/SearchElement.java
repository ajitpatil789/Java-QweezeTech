package com.ajit.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("You Entered: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                System.out.println("Numbers is Found" + " number is : " + arr[i]);
                break;
            } else {
                System.out.println("Not found");
            }
        }
        System.out.println("You Entered: " + Arrays.toString(arr));

    }
}
