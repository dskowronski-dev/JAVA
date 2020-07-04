package com.company;

import com.company.devices.Car;

public class Diesel extends Car {

    public Diesel(String producer, String model, Integer value) {
        super(producer, model, value);
    }

    public Diesel(String producer, String model, Integer yearOfProduction, Integer value) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
