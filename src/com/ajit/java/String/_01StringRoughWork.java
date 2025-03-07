package com.ajit.java.String;

public class _01StringRoughWork {
    public static void main(String[] args) {
        int a = 100;
        String b = "100";
        String c = String.valueOf(a).equals(b) ? "true" : "false";
        System.out.println(c);
//        System.out.println(b.equals(c));
    }

}
