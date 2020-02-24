package net.klymur.examples.java.javascriptembed;

import java.util.Random;

public class Car {
    private final String name;
    static private Random rand = new Random();

    public Car(String name) {
        this.name = name;
    }

    public int drive(String destination) {
        int nMiles = rand.nextInt(100);
        System.out.println(name + " drives to " + destination);
        return nMiles;
    }
}
