package com.ajit.java.Array._1DArray;

public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 45, 80, 78};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {     // num < max  for smallest number
                max = num;
            }
        }
        System.out.println("Largest element is : " + max);
    }
}
