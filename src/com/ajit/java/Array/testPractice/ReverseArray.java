package com.ajit.java.Array.testPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 85, 72, 15};
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Reverse Array is ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
