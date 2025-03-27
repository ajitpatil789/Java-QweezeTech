package com.ajit.java.Array._2DArray;

import java.util.Arrays;

public class DeepCopy2D {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
        System.out.println("Original :" + Arrays.deepToString(original));
        System.out.println("Copy :" + Arrays.deepToString(copy));
    }
}
