package com.ajit.java.Array;

import java.util.Arrays;

public class ReverseArrayUserDefined {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Given Array is :" + Arrays.toString(arr));
        System.out.println("Reversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
