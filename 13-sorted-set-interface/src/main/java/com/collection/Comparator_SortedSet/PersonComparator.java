package com.collection.Comparator_SortedSet;

import java.util.Comparator;

/**
 * karena kita menggunakan class Person, dimana Person tidak memiliki Comparable, maka kita butuh membuat Comparator sendiri
 * PersonComparator adalah Class yang berfungsi sebagai Comparator
 * tujuan Comparator ini untuk mengurutkan data dari 2 Person
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person personName1, Person personName2) {
        // misal kita compate berdarkan name dari person
        // bandingkan dan urutkan ASCENDING, jika ingin DESCENDING cukup balik urutan nama object Person nya
        return personName1.getName().compareTo(personName2.getName());
    }
}
