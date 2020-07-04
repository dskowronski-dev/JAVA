package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.List;

public class Phone extends Device implements Sellable {
    public String producer;
    public String model;
    public Double screenSize;
    public String os;
    public Integer yearOfProduction;

    private static final String DEFAULT_APP_SERVER = "https://appstore.eu";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final Double DEFAULT_VERSION = 1.1;

    public Phone(String producer, String model, Double screenSize, String os, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        //super(null ,null, null);
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installAnnApp(String appName) {
        System.out.println(appName + " install success");
    }

    public void installAnnApp(String appName, String version) {
        System.out.println(appName + " ver." + version + " install success");
    }

    public void installAnnApp(String appName, String version, String server) {
        System.out.println(appName + " ver." + version + " from " + server + " install success");
    }

    public void installAnnApp(List<String> appList) {
        for (String appName : appList
        ) {
            System.out.println(appName + " install success");
        }
        System.out.println(appList.size() + " successfully installed");
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + os + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone TurnOn");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
