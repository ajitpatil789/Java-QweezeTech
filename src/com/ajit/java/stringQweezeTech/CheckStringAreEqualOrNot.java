package com.ajit.java.stringQweezeTech;

public class CheckStringAreEqualOrNot {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "";
        if (s1 == s1) {
            System.out.println("Yes s1 & s2 are equal ");
        } else {
            System.out.println("No s1 & s2 are not equal");
        }

        System.out.println(s1.equals(s2) ? "Equal" : "Not Equal");

        System.out.println(" \"Hello\n wecome to\t our sesion\'s thank you\"");

        System.out.println(s3.isEmpty()); //true
        System.out.println(s3.isBlank()); //true
    }
}
