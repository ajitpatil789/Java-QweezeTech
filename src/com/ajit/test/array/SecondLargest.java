package com.ajit.test.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 50};
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
        int largest = 0;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest is : " + secondLargest);
    }
}
