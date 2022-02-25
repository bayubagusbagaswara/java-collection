package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {

        // create object ArrayList,
        // bisa memasukkan default kapasitas Array nya, misal initialCapacity 100
        // setelah kapasitas default nya terpenuhi, maka otomatis akan membuatkan Array baru
        // sehingga akan semakin lambat

        List<String> fruits = new ArrayList<>(100);

        // add data to fruits
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Avocado");
        fruits.add("Watermelon");

        // change data by index arraylist
        fruits.set(0, "Pineapple"); // change index 0
        fruits.set(1, "Tomato"); // change index 1

        // remove data by index arraylist
        fruits.remove(1); // remove index-1

        // get data by index
        String index0 = fruits.get(0);
        String index2 = fruits.get(2);
        System.out.println("data list index 0 : " + index0);
        System.out.println("data list index 2 : " + index2);

        // get all data
        System.out.println("GET ALL DATA");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
