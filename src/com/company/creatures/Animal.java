package com.company.creatures;

import com.company.Human;
import com.company.Sellable;

import java.io.File;

abstract public class Animal implements Sellable, Feedable {
    static final Double DEFAULT_DOG_WEIGHT = 12.0;
    static final Double DEFAULT_PIG_WEIGHT = 222.0;

    static final Double DEFAULT_FOOD_WEIGHT = 0.5;
    String species;
    String name;
    File pic;
    protected Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "dog")
            this.weight = DEFAULT_DOG_WEIGHT;
        else if (species == "pig")
            this.weight = DEFAULT_PIG_WEIGHT;
    }


    public void feed(Double foodWeight) {
        if (this.weight <= 0) {
            System.out.println("too late");
        } else {
            this.weight += DEFAULT_FOOD_WEIGHT;
            System.out.println("thx for food, my weight: " + this.weight);
        }
    }

    public void takeForAWalk() {
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
