package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {
    public String producer;
    public String model;
    public Double capacity;
    public String color;

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

    public abstract void refuel();

    @Override
    public void turnOn() {
        System.out.println("Engine is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Nie masz tego samochodu");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("Za mały garaż");
        }
        if (buyer.cash < price) {
            throw new Exception("Nie masz tyle PLN");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Transakcja powiodła się!");
    }

}



