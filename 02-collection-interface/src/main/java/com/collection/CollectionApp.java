package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        // misal kita implementasikan collection ke array list
        // dengan ini object names bisa dimanipulasi isi datanya
        Collection<String> names = new ArrayList<>();

        System.out.println("ADD DATA");
        names.add("James Gosling");
        names.add("Rossum");

        // kalau addAll(), maka datanya harus bentuk Collection lagi
        // artinya harus ada implementasi class dari Collection di dalamnya
        // misalnya class List, Set, atau Queue
        names.addAll(Arrays.asList("Ludwig", "Ohm", "Faraday", "Maxwell"));
        names.addAll(List.of("Hawking", "Thomas Edison", "Volta"));

        for (var value : names) {
            System.out.println(value);
        }

        System.out.println("REMOVE DATA");
        names.remove("James Gosling");
        names.removeAll(List.of("Hawking", "Volta", "Ohm"));

        for (var value : names) {
            System.out.println(value);
        }

        System.out.println("CHECK CONTAINS DATA");
        System.out.println(names.contains("Faraday")); // di names apakah terdapat data Faraday
        System.out.println(names.containsAll(Arrays.asList("Thomas Edison", "Maxwell"))); // di names apakah ada data Bayu dan Fuji (harus ada keduanya)
    }
}
