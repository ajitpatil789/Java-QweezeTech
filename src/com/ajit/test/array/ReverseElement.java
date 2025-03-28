package com.ajit.test.array;

import java.util.Arrays;

public class ReverseElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
