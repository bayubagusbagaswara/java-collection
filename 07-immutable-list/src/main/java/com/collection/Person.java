package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private List<String> hobbies;

    // constructor
    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    // method addHobby
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    /**
     * Method Getter hobbies atur menjadi Immutable
     * hanya bisa ambil datanya dan tidak bisa mengubah
     * jadi singkatnya untuk menambah data hobby hanya bisa dilakukan melalui method addHobby
     */
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
