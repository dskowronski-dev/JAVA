package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human((double) 2000);
        me.firstName = "Dominik";
        me.lastName = "Skowronski";

        Car car = new Car();
        car.producer = "Toyota";
        car.model = "C-HR";
        car.color = "Grey";
        car.capacity = 1.2;

        me.aneks = false;
        me.setSalary(3500);
        System.out.println(me.getSalary());
        me.aneks = true;
        me.setSalary(6500);
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
