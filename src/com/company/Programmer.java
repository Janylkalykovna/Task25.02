package com.company;

public class Programmer extends Person{
    String companyname;

    public Programmer(String name, String designation, String companyname) {
        super(name, designation);
        this.companyname = companyname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void code(){
        System.out.println("Programmer is coding");
    }

    @Override
    public void walk() {
        System.out.println("Programmer is walk");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eat");
    }

    @Override
    public void learn() {
        System.out.println("Programmer is learn");
    }

    @Override
    public String toString() {
        return this.name +", "+designation + ", " + companyname;
    }
}
