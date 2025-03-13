package com.ajit.java.Array._2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArrayExample {
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
        //output
//        System.out.println(Arrays.deepToString(numbers));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(numbers));      // Disply output usinf deepToString method
    }
}
