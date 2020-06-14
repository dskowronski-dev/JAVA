package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human(2000.0);
        me.firstName = "Dominik";
        me.lastName = "Skowronski";

        Human kowalski = new Human(76000.0);
        kowalski.firstName = "Jan";
        kowalski.lastName = "Kowalski";
        kowalski.cash = 76000.0;

        Car car = new Car("Toyota", "C-HR", 2017);
        car.color = "Grey";
        car.capacity = 1.2;
        car.value = 72000.0;


        Phone phone = new Phone("Xiaomi", "Mi10Pro", 6.67, "Android", 2020);


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
        car.sell(me, kowalski, me.car.value);




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
