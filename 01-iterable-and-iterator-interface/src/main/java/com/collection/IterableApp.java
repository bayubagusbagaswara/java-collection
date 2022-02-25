package com.collection;

import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        // bikin iterable dengan tipe data generic nya String
        Iterable<String> names = List.of("Einstein", "Tesla", "Newton", "Faraday");

        // untuk mengambil data dari iterable bisa menggunakan foreach
        for (String name : names) {
            System.out.println(name);
        }
    }
}
