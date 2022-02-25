package com.company;

public class Singer extends Person{
    String bandname;

    public Singer(String name, String designation, String bandname) {
        super(name, designation);
        this.bandname = bandname;
    }

    @Override
    public String toString() {
        return name+","+designation+" "+bandname;
    }

    public String getBandname() {
        return bandname;
    }

    public void setBandname(String bandname) {
        this.bandname = bandname;
    }

    public void playg(){
        System.out.println("Singer can play a guitar");
    }

    @Override
    public void walk() {
        System.out.println("Singer is walk");
    }

    @Override
    public void eat() {
        System.out.println("Singer is eat");
    }

    @Override
    public void learn() {
        System.out.println("Singer is learn");
    }


}
