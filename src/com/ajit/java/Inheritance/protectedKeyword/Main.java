package com.ajit.java.Inheritance.protectedKeyword;

import com.ajit.java.Inheritance.Protected2.Cat;
import com.ajit.java.Inheritance.Protected2.Reactangle;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Roman");
        dog.show();
        Cat cat = new Cat("cat");
        cat.show();
        Reactangle reactangle = new Reactangle();
        reactangle.perimeter();
    }
}
