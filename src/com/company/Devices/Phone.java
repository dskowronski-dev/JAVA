package com.company.Devices;

public class Phone extends Device {
    public String producer;
    public String model;
    public Double screenSize;
    public String os;
    public Integer yearOfProduction;

    public Phone() {
        super(null, null, null);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + os + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone TurnOn");
    }
}
