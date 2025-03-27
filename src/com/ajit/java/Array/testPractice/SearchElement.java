package com.ajit.java.Array.testPractice;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 1, 5, 85, 68};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Search element: ");
        int search = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == search) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Numbers is found");
        } else {
            System.out.println("Number is not found");
        }
    }
}
