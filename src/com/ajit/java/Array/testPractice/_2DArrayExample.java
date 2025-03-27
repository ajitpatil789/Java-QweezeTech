package com.ajit.java.Array.testPractice;

import java.util.Arrays;
import java.util.Scanner;

public interface _2DArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = scanner.nextInt();
        System.out.println("Enter Column");
        int cols = scanner.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter search element : ");
        int search = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == search) {
                    System.out.println("Number found at location : (" + i + "," + j + ")");
                    isFound = true;
                    break;
                }
            }

        }
        if (!isFound) {
            System.out.println("Number not found");
        }

    }
}
