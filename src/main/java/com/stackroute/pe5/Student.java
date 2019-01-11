package com.stackroute.pe5;

/**
 * Create a Student class that represents the following information of a student: id, name, and age all
 * the member variables should be private .
 * a. Implement `getter and setter` .
 * b. Create a `StudentSorter` class that implements `Comparator interface` .
 * c. Write a class `Maintest` create Student class object(minimum 5)
 * d. Add these student object into a List of type Student .
 * e. Sort the list based on their age in decreasing order, for student having same
 * age, sort based on their name.
 * f. For students having same name and age, sort them according to their ID.
 */

public class Student {

    private String name="";
    private int age=0;
    private int id=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
