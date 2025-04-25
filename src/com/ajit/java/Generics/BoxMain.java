package com.ajit.java.Generics;

import java.util.Date;

public class BoxMain {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        box.setT(new Phone("Samsung"));
        System.out.println(box.getT());
        
    }
}
