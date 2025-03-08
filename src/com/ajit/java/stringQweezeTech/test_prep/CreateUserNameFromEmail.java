package com.ajit.java.stringQweezeTech.test_prep;

import java.util.Scanner;

public class CreateUserNameFromEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String email = scanner.next();
        System.out.println("Email : " + email);
        String userName = "";
//        String substring = email.substring(0, email.indexOf('@'));
//        System.out.println(substring);

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println("User Name :" + userName);


    }
}
