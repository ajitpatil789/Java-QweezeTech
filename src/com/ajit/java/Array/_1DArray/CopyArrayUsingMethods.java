package com.ajit.java.Array._1DArray;

import java.util.Arrays;

public class CopyArrayUsingMethods {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
//        int[] copy = original.clone();
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(copy));

        // Using System.arraycopy() (Fastest)
//        int[] copy = new int[original.length];
//        System.arraycopy(original, 0, copy, 0, original.length);
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(copy));

        //  Using Arrays.copyOf()
//        int[] copy = Arrays.copyOf(original, original.length);
//        System.out.println(Arrays.toString(copy));

        // Using Arrays.copyOfRange() (Copy Specific Range)
        int[] copy = Arrays.copyOfRange(original, 1, 4);
        System.out.println(Arrays.toString(copy));
    }
}
