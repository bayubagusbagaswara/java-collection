package com.collection;

import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {

        System.out.println("ITERABLE");
        Iterable<String> names = List.of("Einstein", "Tesla", "Newton", "Faraday");
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("ITERATOR");
        Iterator<String> stringIterator = names.iterator();

        // Untuk mengambil data dari iterator menggunakan perulangan while
        // ditambah method hasNext(), balikan hasNext adalah boolean
        // true jika ada datanya dan false jika datanya kosong
        // dan jika hasNext bernilai true, maka perulangan akan dijalankan terus
        // ambil datanya menggunakan method next(), dan simpan di variabel name

        while (stringIterator.hasNext()){
            String name = stringIterator.next();
            System.out.println(name);
        }
    }
}
