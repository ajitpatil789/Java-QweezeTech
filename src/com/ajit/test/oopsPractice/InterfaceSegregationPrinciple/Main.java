package com.ajit.test.oopsPractice.InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        Scanable scanner = new Scanner();
        printer.print();
        scanner.scan();
    }
}
