package com.ajit.java.Array._1DArray;

public class ArrayEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;
        if (array1 == array2) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }
    }
}
