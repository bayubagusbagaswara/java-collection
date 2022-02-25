package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {

        // create object HashSet
        Set<String> fruits = new HashSet<>();

        // add data
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");

        // try input data duplicate
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");


        // unordered data
        // Apple, Orange, Watermelon, Mango
        System.out.println("GET ALL DATA");
        for (var fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
