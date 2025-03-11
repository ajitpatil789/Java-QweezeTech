package com.ajit.java.Array.PracticeQues;

public class EvenOddCountArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;

        for (int count : arr) {
            if (count % 2 == 0) {
                evenCount++;
            } else oddCount++;
        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);
    }

}
