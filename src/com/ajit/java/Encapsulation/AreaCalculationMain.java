package com.ajit.java.Encapsulation;

class Area {
    private int length;
    private int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area is : " + area);
    }
}

public class AreaCalculationMain {
    public static void main(String[] args) {
        Area area = new Area(10, 25);
        area.getArea();
    }
}
