package com.ajit.java.Array._1DArray;

import java.util.Arrays;

public class AverageOfArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum is: " + sum);
        System.out.println("Average: " + (sum) / arr.length);
    }
}