package com.ajit.test.array;

import java.util.Arrays;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 2, 3, 4, 3};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                System.out.print(arr[i] + " ");
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
