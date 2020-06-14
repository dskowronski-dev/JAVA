package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public boolean aneks;
    String lastName;
    Animal pet;
    Phone phone;
    Date date = new Date();
    private Car car;
    private Double salary;

    public Human(Double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        date = new Date();
        System.out.println(date);
        return this.salary;
    }


    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Wypłata nie może być ujemna");
            return;

        } else
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");

        if (!aneks) {
            System.out.println("Musisz odebrać aneks umowy od Pani Hani z działu kadr");
        }
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");

        this.salary = salary;
    }

    public Car getCar() {

        return this.car;
    }

    public void setCar(Car car) {

        if (salary >= car.value) {
            System.out.println("Tou have a new car");
        } else if (salary > (car.value / 12)) {
            System.out.println("You have a new car and credit");
        } else {
            System.out.println("Find new job or go for get a raise");
            return;
        }
        this.car = car;
    }

}
