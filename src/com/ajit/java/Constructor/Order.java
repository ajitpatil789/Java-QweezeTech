package com.ajit.java.Constructor;

public class Order {
    private String orderName;

    public Order(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                '}';
    }

    public void ad1() {
        System.out.println(this); // current object
    }

    public static void main(String[] args) {
        Order order = new Order("pizza");
        order.ad1();
    }
}
