package com.company;

public class Person {
    String name;
    String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    @Override
    public String toString(){
        return this.name+", "+designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void walk(){
        System.out.println("Person is walk");
    }
    public void eat(){
        System.out.println("Person is eat");
    }
    public void learn(){
        System.out.println("Everybody want learn something");
    }

}
