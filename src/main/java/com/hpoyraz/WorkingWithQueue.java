package com.hpoyraz;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 38));
        supermarket.add(new Person("Jack", 14));

        System.out.println(supermarket.size());
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        // Returns: the head of this queue, or null if this queue is empty
        System.out.println(supermarket.peek());
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        // Returns: the head of this queue, or null if this queue is empty
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    static record Person(String name, int age) {}
}
