package com.ajit.java.Array.PracticeQues;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 45, 80, 78};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest element is : " + max);
    }
}
