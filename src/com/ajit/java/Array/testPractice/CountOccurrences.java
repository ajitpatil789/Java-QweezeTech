package com.ajit.java.Array.testPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(arr) + "\n");
        int count = 0;
        System.out.println("Enter target value");
        int target = scanner.nextInt();
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        String result = String.format("Element %d count occurance %d times", target, count);
        System.out.println(result);
    }

}
