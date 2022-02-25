package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        // set empty
        Set<String> empty = Collections.emptySet();

        // set singleton (only one data)
        Set<String> one = Collections.singleton("Albert");

        // change form mutable set to immutable set
        Set<String> mutable = new HashSet<>();
        mutable.add("Albert");
        mutable.add("Newton");
        mutable.add("Faraday");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // create set one by one/manual, ih here cannot input duplicate data
        Set<String> set = Set.of("Albert", "Tesla");

        // saat kita melakukan add dan remove, maka akan terjadi error
        // set.add("Ohm"); // error
        // set.remove("Albert"); // error
    }
}
