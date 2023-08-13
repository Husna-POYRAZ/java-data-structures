package com.hpoyraz;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Ali"));
        System.out.println(map);
        map.put(3, new Person("Aliye"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println("##########");

        map.entrySet()
                .forEach(x ->
                        System.out.println(x.getKey() + ":" + x.getValue()));

        System.out.println("##########");

        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });

        map.remove(3);
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3, new Person("default")));

    }

    record Person(String name){}
}
