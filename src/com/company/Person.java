package com.company;

public class Person {

    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() { return name; }

    public String getDesignation() { return designation; }

    private void learn() {
        System.out.print("learning, ");
    }

    private void walk() {
        System.out.print("walking, ");
    }

    private void eat() {
        System.out.print("eating, ");
    }

    void methods() {
        System.out.print("Skills: ");
        learn();
        walk();
        eat();
    }
}
