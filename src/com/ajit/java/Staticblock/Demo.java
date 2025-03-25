package com.ajit.java.Staticblock;

class StaticBock {
    void ab() {
        System.out.println("This is method");
    }

    {
        // normal block instance block
        System.out.println("Normal block");
    }

    static {
        System.out.println("Static block");
    }

    public StaticBock() {
        System.out.println("constructor");
    }
}

public class Demo {
    public static void main(String[] args) {
        StaticBock staticBock = new StaticBock();
//        StaticBock staticBock1 = new StaticBock();
//        staticBock.ab();

    }
}
