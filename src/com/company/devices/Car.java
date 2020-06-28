package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Car extends Device implements Sellable {
    public String producer;
    public String model;
    public Double capacity;
    public String color;
    public Double value;
    public Integer yearOfProduction;


    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return producer + " " + model + " " + capacity + " " + color + " " + value;
    }


    @Override
    public void turnOn() {
        System.out.println("Engine is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.car != this) {
            throw new Exception("Nie możesz sprzedać czegoś czego nie masz");
        } else if (buyer.cash < price) {
            throw new Exception("Nie masz kasy");
        }

        buyer.cash -= price;
        seller.cash += price;
        buyer.car = seller.car;
        seller.car = null;
        System.out.println("Transakcja powiodła się");


    }
}


