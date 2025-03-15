package com.ajit.java.Array._2DArray;

import java.util.Scanner;

public class TransposeAndMirroring {
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
        int[][] transpose = new int[cols][row];
        System.out.println("Tanspose Matrix: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = number[j][i];
                System.out.print(transpose[i][j] + " ");
                
            }
            System.out.println();
        }
        for (int i = 0; i < cols; i++) {
            int left = 0;
            int right = row - 1;
            while (left < right) {
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("\nTransposed and Mirrored Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
