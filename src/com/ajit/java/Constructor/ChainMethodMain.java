package com.ajit.java.Constructor;

public class ChainMethodMain {
    public static void main(String[] args) {
        ChainMethod chainMethod = new ChainMethod()
                .setName("Ajit")
                .setAge(28);
        System.out.println(chainMethod);

    }
}
