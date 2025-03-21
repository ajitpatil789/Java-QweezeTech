package com.ajit.java.Inheritance.Multilevel;

// Dog inherits from Mammal (which already inherits from Animal)
// Child Class
public class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
