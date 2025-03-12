package com.ajit.java.Array;

import java.util.Arrays;

public class ArrayCopyUserDefined {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] duplicate = new int[numbers.length];


        System.out.println("Array elements:" + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            duplicate[i] = numbers[i];
        }
        System.out.println("Original Array :" + Arrays.toString(numbers));
        System.out.println("Duplicate Array :" + Arrays.toString(duplicate));


    }
}
