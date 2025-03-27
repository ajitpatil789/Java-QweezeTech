package com.ajit.java.Array._1DArray;

import java.util.Scanner;

public class ArrayExample {
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
        for (int num : arr) {
            System.out.print(num + " ");
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }
}



