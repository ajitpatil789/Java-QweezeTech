package com.ajit.java.loop.pattern;

public class Pattern3 {
    public static void main(String[] args) {
        //       1. Simple Half Pyramid
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // reverse half pyramid
//        int n = 4;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
