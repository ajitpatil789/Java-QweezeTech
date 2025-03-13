package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class FindLargestElement {
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
        int max = numbers[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("Largest element is: " + max);
    }
}
