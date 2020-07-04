package com.company;

import com.company.devices.Car;

public class Electric extends Car {
    public Electric(String producer, String model, Integer value) {
        super(producer, model, value);
    }

    public Electric(String producer, String model, Integer yearOfProduction, Integer value) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
