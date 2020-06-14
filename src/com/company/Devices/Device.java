package com.company.Devices;

public abstract class Device {

    double voltage;

    public Device(String model, String producer, Integer yearOfProduction) {

    }

    public abstract void turnOn();
}
