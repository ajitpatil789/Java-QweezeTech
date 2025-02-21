package com.ajit.java.VariablesAndDatatypes;

import java.util.Scanner;

public class AllOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for demonstration
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter a boolean value (flag): ");
        boolean flag = scanner.nextBoolean();

        // 1. Arithmetic Operators
        System.out.println("\n🧮 Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("b-- = " + (b--)); // Post-decrement
        System.out.println("b after decrement = " + b); // Check decremented value

        // 2. Assignment Operators
        System.out.println("\n📥 Assignment Operators:");
        int c = 10;
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5 -> " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3 -> " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 -> " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4 -> " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 -> " + c);

        // 3. Comparison (Relational) Operators
        System.out.println("\n🔍 Comparison Operators:");
        System.out.println("a == b : " + (a == b)); // Equal to
        System.out.println("a != b : " + (a != b)); // Not equal to
        System.out.println("a > b  : " + (a > b));  // Greater than
        System.out.println("a < b  : " + (a < b));  // Less than
        System.out.println("a >= b : " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b : " + (a <= b)); // Less than or equal to

        // 4. Logical Operators
        System.out.println("\n🤖 Logical Operators:");
        System.out.println("(a > b) && flag : " + ((a > b) && flag)); // Logical AND
        System.out.println("(a < b) || flag : " + ((a < b) || flag)); // Logical OR
        System.out.println("!flag : " + (!flag)); // Logical NOT

        // 5. Bitwise Operators
        System.out.println("\n🔄 Bitwise Operators:");
        System.out.println("a & b : " + (a & b)); // Bitwise AND Performs a bitwise AND operation on two integers. The result is 1 only if both corresponding bits are 1.
        System.out.println("a | b : " + (a | b)); // Bitwise OR Performs a bitwise OR operation. The result is 1 if at least one of the corresponding bits is 1.
        System.out.println("a ^ b : " + (a ^ b)); // Bitwise XOR Performs a bitwise exclusive OR. The result is 1 if the corresponding bits are different.
        System.out.println("~a : " + (~a));       // Bitwise NOT Inverts the bits of the operand (unary operator).
        System.out.println("a << 1 : " + (a << 1)); // Left shift Shifts bits to the left, filling with zeros. Each shift to the left is equivalent to multiplying by 2.
        System.out.println("a >> 1 : " + (a >> 1)); // Right shift Shifts bits to the right, preserving the sign bit (sign extension).
        System.out.println("a >>> 1 : " + (a >>> 1)); // Unsigned right shift shifts bits to the right, filling with zeros (no sign extension).

        // 6. Unary Operators
        System.out.println("\n🎲 Unary Operators:");
        int d = -a;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Unary plus +a : " + (+a));
        System.out.println("Unary minus -a : " + d);
        System.out.println("++a : " + (++a)); // Pre-increment
        System.out.println("--b : " + (--b)); // Pre-decrement

        // 7. Ternary Operator
        System.out.println("\n❓ Ternary Operator:");
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Result: " + result);

        // 8. instanceof Operator
        System.out.println("\n📚 instanceof Operator:");
        String name = "Ajit";
        System.out.println("Is 'name' a String? : " + (name instanceof String));

        scanner.close();
    }
}
