package com.company;

import com.company.devices.Car;

public class LPG extends Car {
    public LPG(String producer, String model, Integer value) {
        super(producer, model, value);
    }

    public LPG(String producer, String model, Integer yearOfProduction, Integer value) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {

    }

}
