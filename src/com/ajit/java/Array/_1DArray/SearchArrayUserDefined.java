package com.ajit.java.Array._1DArray;

import java.util.Arrays;

public class SearchArrayUserDefined {
    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int search = 30;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Searching for: " + search);


        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Number " + search + " is found at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Number not found ");
        }
    }
}
