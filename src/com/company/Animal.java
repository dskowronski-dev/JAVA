package com.company;

import java.io.File;

public class Animal implements Sellable {
    static final Double DEFAULT_DOG_WEIGHT = 12.0;
    String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "dog")
            this.weight = DEFAULT_DOG_WEIGHT;
    }

    void feed() {
        if (this.weight <= 0) {
            System.out.println("too late");
        } else {
            this.weight++;
            System.out.println("thx for food, my weight: " + this.weight);
        }
    }

    void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println("i'm dead you can not go with dead pet");
        } else if (this.weight > 3) {
            this.weight--;
            System.out.println("thanks for walk, my weight: " + weight);
        } else if (this.weight <= 3) {
            this.weight--;
            System.out.println("Thanks for walk, i'm hungry" + this.weight);
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
