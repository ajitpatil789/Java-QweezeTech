package com.ajit.java.collection.Queue.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(11);
        queue.add(10);
        queue.add(15);
//        System.out.println(queue);
        System.out.println("Peak : " + queue.peek());
        queue.poll();
        System.out.println("Peak : " + queue.peek());
//        System.out.println("Removed: " + queue.remove(11));
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}
