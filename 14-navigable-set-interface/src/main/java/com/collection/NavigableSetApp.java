package com.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        // create object names bertipe NavigableSet, dengan menggunakan implementasi class TreeSet()
        NavigableSet<String> names = new TreeSet<>();

        // add data
        names.addAll(Set.of("Albert", "Faraday", "Tesla", "Gosling", "Thomas Edison", "Newton"));

        // data after ordered
        System.out.println("GET ALL DATA NAMES");
        for (String name : names) {
            System.out.println(name); // Albert, Faraday, Gosling, Newton, Tesla. Thomas Edison
        }

        // create object nameReverse, dimana isi datanya berasal dari object names yang diibalik urutannya (descending)
        NavigableSet<String> namesReverse = names.descendingSet();
        System.out.println("GET ALL DATA NAMES REVERSE");
        for (String name : namesReverse) {
            System.out.println(name);
        }

        // Mengambil data hanya sebagian, tidak semua data diambil
        // headSet() itu dari data yang paling awal sampai element yang kita tentukan, batas data bisa diset true/false
        // tailSet() itu dari data paling akhir sampai element yang kita tentukan

        NavigableSet<String> headSet = names.headSet("Gosling",false); // false artinya data Gosling tidak di include
        NavigableSet<String> tailSet = names.tailSet("Newton",true); // true artinya data Newton di include

        System.out.println("GET ALL DATA HEAD SET");
        for (String name : headSet) {
            System.out.println(name); // Albert, Faraday
        }

        System.out.println("GET ALL DATA TAIL SET");
        for (String name : tailSet) {
            System.out.println(name); // Tesla, Thomas Edison
        }

        // covert object from type NavigableSet to Immutable NavigableSet
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);

        // immutable.add("Ohm"); // ERROR
    }
}
