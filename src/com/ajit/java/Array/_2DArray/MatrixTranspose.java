package com.ajit.java.Array._2DArray;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Define a matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Get the dimensions of the matrix
//        int rows = matrix.length;
//        int cols = matrix[0].length;
        int rows = 2;
        int cols = 3;

        // Create a transpose matrix with swapped dimensions
        int[][] transpose = new int[cols][rows];

        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print Original Matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print Transposed Matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
