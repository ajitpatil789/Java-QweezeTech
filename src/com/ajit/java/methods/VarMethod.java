package com.ajit.java.methods;

// Methods is a block of code which only runs when it invoked.
/*
    - Access Modifier
    - Optional Static
    - Return type
    - Name
    - Optional Parameters
    - Method body
    - Optional return type
 */
public class VarMethod {
    public int a = 12;
    public static int s = 135;

    public void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    private static int addition(int a, int b) {
        int addResult = a + b;
        return addResult;
    }

    public void demo() {
        System.out.println(a);
        int c = 135;
        System.out.println(s++);
    }

    public int sub() {
        System.out.println("Integer Method");
        return 12;
    }

    public String sub1() {
        System.out.println("String Method");
        return "Ajit";
    }

    public float floatValue() {
        System.out.println("Float Method");
        return 12.25f;
    }

    public static void main(String[] args) {
        VarMethod varMethod = new VarMethod();
        varMethod.add(10, 20);
        varMethod.demo();
        varMethod.sub();
        varMethod.sub1();
        varMethod.floatValue();
        System.out.println(varMethod.a);
        int output = addition(10, 1000);
        System.out.println(output);

    }
}
