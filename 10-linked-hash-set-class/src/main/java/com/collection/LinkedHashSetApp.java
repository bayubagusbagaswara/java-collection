package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {
    public static void main(String[] args) {

        // create object LinkedHashSet
        Set<String> fruits = new LinkedHashSet<>();

        // add data to set fruits
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // try input duplicate data
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        // ordered data
        // get all data, Apple, Orange, Pineapple, Mango
        System.out.println("GET ALL DATA");
        for (var fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
