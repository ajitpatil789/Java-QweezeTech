package com.ajit.java.String;

public class _03ConcatinationOfString {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str1.concat(str2));
        System.out.println(str3);

        // concat using String Buffer
        StringBuffer buffer = new StringBuffer("Java");
        System.out.println(buffer.append(" Programming"));
    }


}
