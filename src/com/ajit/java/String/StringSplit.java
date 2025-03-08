package com.ajit.java.String;

public class StringSplit {
    public static void main(String[] args) {
        String s = "apple,banana,orange";
        String[] split = s.split(", ");

//        for (String fruits : split) {
//            System.out.println(fruits);
//        }

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
