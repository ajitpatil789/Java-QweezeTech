package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class Add2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter column: ");
        int cols = scanner.nextInt();
        int[][] numbers = new int[rows][cols];
        int[][] numbres2 = new int[rows][cols];
        System.out.println("Enter Elements for 1st Array");
        //Input for number
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        // input for number 2
        System.out.println("Enter element for 2nd Array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbres2[i][j] = scanner.nextInt();
            }
        }
        int[][] add = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                add[i][j] = numbers[i][j] + numbres2[i][j];
            }
        }
        // output
        System.out.println("Addition of Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
