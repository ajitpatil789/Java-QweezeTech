package com.ajit.java.String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else System.out.println("not palindrome");

//        StringBuilder builder = new StringBuilder(s);
//        String reversed = builder.reverse().toString();
//        if (s.equals(reversed)) {
//            System.out.println("Palindrome");
//        } else System.out.println("not palindrome");

        // Using StringBuffer
//        StringBuffer buffer = new StringBuffer("madam");
//        StringBuffer reversed = buffer.reverse();
//        System.out.println(reversed);
//        System.out.println((buffer.equals(reversed) ? "Palindrome" : "Not"));

    }
}
