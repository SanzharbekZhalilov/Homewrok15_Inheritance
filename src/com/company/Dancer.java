package com.company;

public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nDesignation: " + getDesignation()
                + "\nGroup: " + groupName;
    }

    void dancing() {
        System.out.println("dancing");
    }
}
