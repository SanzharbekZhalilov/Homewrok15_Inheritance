package com.company;

public class Programmer extends Person {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nDesignation: " + getDesignation()
                + "\nCompany: " + companyName;
    }

    void coding() {
        System.out.println("coding in Java");
    }
}