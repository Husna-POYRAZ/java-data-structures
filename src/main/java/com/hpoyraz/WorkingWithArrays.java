package com.hpoyraz;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {100, 200};

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors.length);

        System.out.println("##################");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("##################");

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println("##################");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("##################");

        Arrays.stream(colors).forEach(System.out::println);

    }
}
