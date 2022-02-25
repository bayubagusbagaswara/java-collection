package com.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        // create object bertipe List menggunakan implementasi Vector()
        List<String> list = new Vector<>();

        // add data to list
        list.add("Albert");
        list.add("Tesla");
        list.add("Gosling");
        list.add("Faraday");

        // get all data from list
        for (String value : list) {
            System.out.println(value);
        }
    }
}
