package com.ajit.java.Array.testPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest element is : " + largest);
        System.out.println("Largest element is : " + smallest);
    }
}
