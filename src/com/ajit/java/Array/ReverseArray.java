package com.ajit.java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    //    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] temp = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[arr.length - 1 - i];
//        }
//        System.out.println("Recersed Array: " + Arrays.toString(temp));
//    }
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 25;
//        arr[1] = 20;
//        System.out.println(arr[0]);
//        System.out.println(Arrays.toString(arr));
//        for (int s : arr) {
//            System.out.println(s);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Array of size n

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print("Reversed Array:" + arr[i] + " ");
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }
}
