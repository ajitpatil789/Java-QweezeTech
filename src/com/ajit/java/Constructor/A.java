package com.ajit.java.Constructor;

public class A {

    int a = 50;

    public A() {
        this(500);
        System.out.println("default constructor");
    }

    public A(int a) {

        this.a = a;
        System.out.println(a);
    }

    void show() {
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        A a1 = new A();
//        a1.show();
    }
}

