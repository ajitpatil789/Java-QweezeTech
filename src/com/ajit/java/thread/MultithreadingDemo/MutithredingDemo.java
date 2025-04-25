package com.ajit.java.thread.MultithreadingDemo;


class first extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MutithredingDemo {
    public static void main(String[] args) {
        first first = new first();
        Second second = new Second();
        first.start();
        second.start();
    }
}
