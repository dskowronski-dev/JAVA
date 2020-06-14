package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human(2000.0);
        me.firstName = "Dominik";
        me.lastName = "Skowronski";

        Car car = new Car();
        car.producer = "Toyota";
        car.model = "C-HR";
        car.color = "Grey";
        car.capacity = 1.2;
        car.value = 72000.0;
        car.yearOfProduction = 2017;

        Phone phone = new Phone();
        phone.yearOfProduction = 2020;
        phone.producer = "Xiaomi";
        phone.model = "Mi10Pro";
        phone.os = "Android";
        phone.screenSize = 6.67;


        me.aneks = false;
        me.setSalary(3500.0);
        System.out.println(me.getCar());
        me.setCar(car);
        System.out.println(me.getCar());
        System.out.println(me.getSalary());
        me.aneks = true;
        me.setSalary(6500.0);
        System.out.println(me.getCar());
        me.setCar(car);
        System.out.println(me.getCar());
        System.out.println(me.getSalary());
        me.setSalary(76500.0);
        me.setCar(car);
        System.out.println(car.model);
        System.out.println(me.getSalary());
        System.out.println(car);
        System.out.println(phone);
        phone.turnOn();
        car.turnOn();
        car.turnOn();



        /*Animal dog = new Animal("dog");

        me.pet = dog;
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();*/


    }
}
