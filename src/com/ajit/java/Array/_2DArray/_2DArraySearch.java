package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class _2DArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter cols: ");
        int cols = scanner.nextInt();
        int[][] number = new int[row][cols];
        System.out.println("Enter Elements: ");
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = scanner.nextInt();
            }
        }
        // display the 2D array
        System.out.println("2D Array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        // search
        System.out.println("Enter element to search: ");
        int x = scanner.nextInt();
        scanner.close();
        boolean isFound = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("Number found at location (" + i + "," + j + ")");
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.println("Number not found");
        }
    }
}
