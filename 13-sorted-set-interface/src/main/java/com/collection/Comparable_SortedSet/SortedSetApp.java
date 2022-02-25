package com.collection.Comparable_SortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        // create object SortedSet yang menggunakan Comparable
        // dimana tipe data genericnya adalah class Person
        SortedSet<Person> personSortedSet = new TreeSet<>();

        // add data
        personSortedSet.add(new Person("Albert"));
        personSortedSet.add(new Person("Faraday"));
        personSortedSet.add(new Person("Tesla"));
        personSortedSet.add(new Person("Gosling"));

        // get all data
        System.out.println("GET ALL DATA SORTEDSET");
        for (var value : personSortedSet) {
            System.out.println(value.getName());
        }

        // convert from mutable SortedSet to immutable SortedSet
        SortedSet<Person> people = Collections.unmodifiableSortedSet(personSortedSet);

        // people.add(new Person("Ohm")); // ERROR, unsupportedOperationException
    }
}
