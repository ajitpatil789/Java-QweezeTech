package com.ajit.test.oopsPractice.InterfaceSegregationPrinciple;

public class Scanner implements Scanable {
    @Override
    public void scan() {
        System.out.println("Scanning documents");
    }
}
