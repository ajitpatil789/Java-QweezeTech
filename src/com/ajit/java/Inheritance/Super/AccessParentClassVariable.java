package com.ajit.java.Inheritance.Super;

class Parent {
    public String name = "Parent class";

    Parent() {
        System.out.println("Parent Constructor");
    }

    void show() {
        System.out.println("Parent class method");
    }
}

class Chaild extends Parent {
    String name = "Chaild name";

    Chaild() {
        super();
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println("Chaild name: " + name);
        System.out.println("Parent name: " + super.name);
        super.show();

    }
}


public class AccessParentClassVariable {
    public static void main(String[] args) {
        Chaild c = new Chaild();
        c.display();
    }

}

