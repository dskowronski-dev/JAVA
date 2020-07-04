package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human(2000.0, 200.0);
        me.firstName = "Dominik";
        me.lastName = "Skowronski";
        me.cash = 100.0;

        Human kowalski = new Human(76000.0, 200.0);
        kowalski.firstName = "Jan";
        kowalski.lastName = "Kowalski";
        kowalski.cash = 76000.0;

        Car car = new Car("Toyota", "C-HR", 2017);
        car.color = "Grey";
        car.capacity = 1.2;
        car.value = 72000.0;
        me.getCar(1);

        me.setCar(car, 1);

        //me.setCar(new Car("Mercedes", "W203", 2003), 2);


        Phone phone = new Phone("Xiaomi", "Mi10Pro", 6.67, "Android", 2020);


        me.aneks = true;
        me.setSalary(3500.0);
        System.out.println(me.getCar(1));
        me.setCar(car, 1);
        System.out.println(me.getCar(1));
        System.out.println(me.getSalary());
        me.aneks = true;
        me.setSalary(6500.0);
        System.out.println(me.getCar(1));
        me.setCar(car, 1);
        System.out.println(me.getCar(1));
        System.out.println(me.getSalary());
        me.setSalary(76500.0);
        me.setCar(car, 1);
        System.out.println(car.model);
        System.out.println(me.getSalary());
        System.out.println(car);
        System.out.println(phone);
        phone.turnOn();
        car.turnOn();
        car.turnOn();
        System.out.println(me.getCar(1));
        System.out.println(kowalski.getCar(1));
        car.sell(me, kowalski, me.getCar(1).value);
        System.out.println(me.getCar(1));
        System.out.println(kowalski.getCar(1));





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
