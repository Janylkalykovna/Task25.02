package com.company;

public class Dancer extends Person{
    String groupename;

    public Dancer(String name, String designation, String groupename) {
        super(name, designation);
        this.groupename = groupename;
    }

    @Override
    public String toString(){
        return this.name+", "+designation+", "+groupename;
    }

    public String getGroupename() {
        return groupename;
    }

    public void setGroupename(String groupename) {
        this.groupename = groupename;
    }

    public void dance(){
        System.out.println("Dancer is dancing break dance");
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public void walk() {
        System.out.println("Dancer is walk");
    }

    @Override
    public void eat() {
        System.out.println("Dancer is eat");
    }

    @Override
    public void learn() {
        System.out.println("Dancer is learn");
    }

}
