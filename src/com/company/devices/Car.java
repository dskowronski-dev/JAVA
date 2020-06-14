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


    public Car() {
        super(null, null, null);
        this.producer = producer;
        this.model = model;
    }

    public String toString() {
        return producer + " " + model + " " + capacity + " " + color + " " + value;
    }


    @Override
    public void turnOn() {
        System.out.println("Engine is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car == null) {
            System.out.println("Nie posiada samochodu");
            return;
        } else if (buyer.cash < seller.car.value) {
            System.out.println("Kupujący ma za mało kasy");
        } else {
            buyer.cash -= seller.car.value;
            seller.cash = seller.cash + price;
            buyer.car = seller.car;
            seller.car = null;
            System.out.println("Transakcja powiodła się");
        }

    }
}


