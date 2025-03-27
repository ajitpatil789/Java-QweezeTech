package com.ajit.java.Array._1DArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddelementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 50, 45, 80, 78};
        System.out.println("Enter new element you want add ");
        int addNewElement = sc.nextInt();
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[newArray.length - 1] = addNewElement;
        System.out.println("first Array:" + Arrays.toString(numbers));
        System.out.println("New Array:" + Arrays.toString(newArray));
    }
}
