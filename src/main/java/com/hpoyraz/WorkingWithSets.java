package com.hpoyraz;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

        balls.remove(new Ball("blue"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);

    }

    record Ball(String color){}
}
