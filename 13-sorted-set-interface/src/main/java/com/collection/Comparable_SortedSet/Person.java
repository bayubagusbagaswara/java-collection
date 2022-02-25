package com.collection.Comparable_SortedSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Person kita buat langsung implement interface Comparable
 * artinya kita bisa menggunakan method Compare di class Person ini, jadi tidak perlu membuat Comparator secara manual
 * Comparable sendiri adalah generic, kita bisa isi tipe data generic terserah
 * misal kita isi genericnya adalah Person class ini sendiri
 * sehingga method-method didalam Comparable akan menggunakan object Person untuk melakukan eksekusi perintah
 */
public class Person implements Comparable<Person>{
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    // implement compare
    @Override
    public int compareTo(Person person) {
        // compare by name
        // artinya name pada class saat ini akan dibandingkan dengan name dari Person lainnya
        return name.compareTo(person.getName());
    }
}
