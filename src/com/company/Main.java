package com.company;

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

        me.aneks = false;
        me.setSalary(3500.0);
        me.setCar();
        me.getCar();
        System.out.println(me.getSalary());
        me.aneks = true;
        me.setSalary(6500.0);
        me.setCar();
        me.getCar();
        System.out.println(me.getSalary());
        me.setSalary(76500.0);
        me.setCar();
        me.getCar();
        System.out.println(me.getSalary());




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
