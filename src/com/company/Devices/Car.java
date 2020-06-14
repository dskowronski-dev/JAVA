package com.company.Devices;

public class Car extends Device {
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
}


