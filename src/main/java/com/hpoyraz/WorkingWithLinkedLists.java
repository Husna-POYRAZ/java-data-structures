package com.hpoyraz;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {

    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 32));
        linkedList.addLast(new Person("Maria", 25));
        linkedList.addFirst(new Person("Ali", 19));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("##########");

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}

}
