package com.company.devices;

public abstract class Device {

    public double voltage;
    public String producer;
    public String model;
    public Integer yearOfProduction;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();
}
