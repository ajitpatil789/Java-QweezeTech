package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class TransposeUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter column: ");
        int cols = scanner.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter Elements into 2D Array");
        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        int[][] transpose = new int[cols][rows]; // Corrected dimensions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = numbers[i][j];
            }
        }
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < cols; i++) { // Corrected loop bounds
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}