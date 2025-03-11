package com.ajit.java.Array.PracticeQues;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 45, 80, 78};
        int left = 0;
        int right = numbers.length - 1;
        System.out.println("Original:" + Arrays.toString(numbers));
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed : " + Arrays.toString(numbers));
    }
}
