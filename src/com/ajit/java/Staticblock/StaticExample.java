package com.ajit.java.Staticblock;

class StaticDemo {
    static int staticVariable = 10;     // Static Variable
    String name = "Ajit";              // instance variable
    static int count = 10;

    public static void staticMethod() { // Static method
        System.out.println("This is static method");
    }

    public void instanceMethod() {       // instance method
        System.out.println("Instance method");
    }

    public static int square(int a) {
        return a * a;
    }

    public void display() {
        System.out.println(square(25));
    }

    public static int countInc() {
        return count++;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(StaticDemo.staticVariable);  // Access without an object
        StaticDemo.staticMethod();  // Access without an object
        StaticDemo demo = new StaticDemo();
        System.out.println(demo.name);
        demo.instanceMethod();
        System.out.println("Square of A is : " + StaticDemo.square(10));
        System.out.println("count: " + StaticDemo.count);
        demo.display();
    }
}
