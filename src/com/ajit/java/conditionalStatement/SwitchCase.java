package com.ajit.java.conditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
/*
        if (choice == 1) {
            System.out.println("Projector is ON");
        } else if (choice == 2) {
            System.out.println("Projector is OFF");
        } else if (choice == 3) {
            System.out.println("Light is ON");
        } else {
            System.out.println("Invalid choice");
        }

 */
        switch (choice) {
            case 1:
                System.out.println("Projector is ON");
                break;
            case 2:
                System.out.println("Projector is OFF");
                break;
            case 3:
                System.out.println("Light is ON");
            case 4:
                System.out.println("Invalid choice");
        }

    }
}
