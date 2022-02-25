package com.collection.Comparator_SortedSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Person ini tidak mengimplement Interface Comparable<>
 * Jadi, kita harus membuat Comparator sendiri secara manual
 * kita buat Comparator untuk class Person ini dengan nama PersonComparator
 */
public class Person {

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
}
