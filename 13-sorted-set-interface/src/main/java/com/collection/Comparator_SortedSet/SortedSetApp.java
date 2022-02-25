package com.collection.Comparator_SortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        // disini kita menggunakan Comparator sendiri untuk mengurutkan data di SortedSet
        // artinya kita harus memasukkan Comparator kedalam intansiasi object SortedSet nya
        // misalnya kita menggunakan comparator PersonComparator

        SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator());

        // urutkan secara descending
        // SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator().reversed());

        // add data to SortedSet
        // karena data yang ingin kita masukkan ke SortedSet berupa object Person,
        // maka kita perlu instance dulu objectnya dari class Person

        personSortedSet.add(new Person("Albert"));
        personSortedSet.add(new Person("Faraday"));
        personSortedSet.add(new Person("Tesla"));
        personSortedSet.add(new Person("Gosling"));

        // get all data
        System.out.println("GET ALL DATA SORTEDSET");
        for (var value : personSortedSet) {
            System.out.println(value.getName());
        }

        // convert from sortedset to immutable sortedSet
        // data didalam immutable sortedset tidak bisa diubah-ubah lagi, add maupun remove akan error
        SortedSet<Person> people = Collections.unmodifiableSortedSet(personSortedSet);

        // people.add(new Person("Ohm")); // ERROR, UnsupportedOperationException
        // people.remove(new Person("Gosling")); // ERROR, UnsupportedOperationException
    }
}
