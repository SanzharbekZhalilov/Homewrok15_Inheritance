package com.company;

public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nDesignation: " + getDesignation()
                + "\nBand: " + bandName;
    }

    void sing() {
        System.out.print("singing, ");
    }

    void playGuitar() {
        System.out.println("playing on guitar");
    }
}
