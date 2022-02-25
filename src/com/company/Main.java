package com.company;

public class Main {

    public static void main(String[] args) {


        Person person= new Person("Adam",  "Surviver");
        System.out.println(person);
        person.eat();
        person.walk();
        person.learn();
        System.out.println(" ");

	Dancer dancer=new Dancer("Aychurok", "dancer", "Akkuular");
        System.out.println(dancer);
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dance();
        System.out.println(" ");


    Singer singer=new Singer("Akjol",  "'opera singer'", "klassico");
        System.out.println(singer);
         singer.walk();
         singer.eat();
         singer.learn();
         singer.playg();
        System.out.println(" ");

    Programmer programmer=new Programmer("Almanbet",  "Java coder", "Peaksoft");
        System.out.println(programmer);
        programmer.walk();
        programmer.eat();
        programmer.learn();
        programmer.code();
        System.out.println(" ");


    }
}
