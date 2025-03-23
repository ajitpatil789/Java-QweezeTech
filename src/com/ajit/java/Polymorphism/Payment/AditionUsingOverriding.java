package com.ajit.java.Polymorphism.Payment;

class basic {
    void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Addition is :" + add);
    }

    void add() {
        System.out.println("int method");
    }

    double add(double price) {
        return 125.00;
    }
}


public class AditionUsingOverriding {
    public static void main(String[] args) {
        basic basic = new basic();
        basic.add(10, 20);
        basic.add();
        System.out.println("Price is : " + basic.add(125.50));
    }
}
