package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Person ini bersifat Mutable artinya bisa diubah-ubah List nya
 */
public class Person {
    private String name;
    private List<String> hobbies;

    // constructor
    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }



    // method addHobby for adding data to list hobbies
    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
