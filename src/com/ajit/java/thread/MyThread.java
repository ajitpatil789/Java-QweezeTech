package com.ajit.java.thread;

public class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + " finnished..!");
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("My First Thread");
        t1.start();

        t1.join();
        System.out.println("My thread ended...");
    }
}
