package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter column: ");
        int cols = scanner.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter Elements into 2D Array");
        //Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter element you want to search");
        int x = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Number is found at location : (" + i + "," + j + ")");
                }
            }
        }
    }
}
