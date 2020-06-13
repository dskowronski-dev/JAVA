package com.company;

import java.util.Date;

public class Human {
    public String firstName;
    public boolean aneks;
    String lastName;
    Animal pet;
    Phone phone;
    private Car car;

    private Double salary;

    Date date = new Date();

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

}
