package com.company;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Sanzharbek Zhalilov", "Java developer", "PeakSoft House");
        Dancer dancer = new Dancer("Atai Omurzakov", "robot dancer", "Tumar");
        Singer singer = new Singer("Jimi Hendrix", "rock musician", "(no band)");

        System.out.println(programmer);
        programmer.methods();
        programmer.coding();

        System.out.println("\n" + dancer);
        dancer.methods();
        dancer.dancing();

        System.out.println("\n" + singer);
        singer.methods();
        singer.sing();
        singer.playGuitar();


    }
}