package com.company;

import java.time.LocalDateTime;

public class Human {
    public String firstName;
    String lastName;
    Animal pet;
    Phone phone;
    private Double salary;
    Car car;
    public boolean aneks;

    public double getSalary(LocalDateTime LocalDate) {
        LocalDateTime.now();
        return this.salary;

    }


    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Wypłata nie może być ujemna");
        } else
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");

        if (!aneks) {
            System.out.println("Musisz odebrać aneks umowy od Pani Hani z działu kadr");
        }
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");

        this.salary = salary;
    }

}
