package com.ajit.java.Array._1DArray;

import java.util.Arrays;

public class ArrayCopyUserDefined {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] duplicate = new int[numbers.length];
//        int[] copy = numbers.clone();
//        System.out.println("Copy array using clone: " + Arrays.toString(copy));
//        int[] arraysCopyMethod = Arrays.copyOf(numbers, numbers.length);
//        System.out.println("copy Array using Arrays.copyOf() " + Arrays.toString(arraysCopyMethod));


        System.out.println("Array elements:" + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            duplicate[i] = numbers[i];
        }
        System.out.println("Original Array :" + Arrays.toString(numbers));
        System.out.println("Duplicate Array :" + Arrays.toString(duplicate));


    }
}
