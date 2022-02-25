package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {

        // create list from LinkedList
        List<String> strings = new LinkedList<>();

        // add data to list
        strings.add("Apple"); // index 0
        strings.add("Starfruit"); // index 1
        strings.add("Orange"); // index 2
        strings.add("Mango"); // index 3
        strings.add("Blueberry"); // index 4

        // change data
        strings.set(0, "Pineapple"); // change index 0

        // remove data
        strings.remove(1);

        // get data
        System.out.println(strings.get(0));
        System.out.println(strings.get(2));

        System.out.println("GET ALL DATA");
        for (var value : strings) {
            System.out.println(value);
        }
    }
}
