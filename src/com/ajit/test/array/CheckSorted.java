package com.ajit.test.array;

public class CheckSorted {
    // Check Array is sorted or not
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // If any element is greater than the next, it's not sorted
                isSorted = false;
                break; // No need to check further
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
