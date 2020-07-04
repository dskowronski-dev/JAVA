package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    public FarmAnimal(String species, Double weight) {
        super(species);
        this.weight = weight;

    }

    @Override
    public void beEaten() {
        System.out.println("Zjedzony!");
        this.weight = 0.0;
    }

    @Override
    public void feed() {

    }
}
