package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public boolean aneks;
    String lastName;
    public Animal pet;
    Phone phone;
    Date date = new Date();
    private Double salary;
    public Double cash;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    private final Car[] garage;

    public Human(Double salary, Double cash) {
        this.cash = cash;
        this.salary = salary;
        garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human() {

        garage = new Car[DEFAULT_GARAGE_SIZE];
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

    public Car[] getGarage() {

        return this.garage;
    }

    public Car getCar(Integer index) {

        return this.garage[index];
    }


    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }

    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null)
                sum += car.value;
        }
        return sum;
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.hasFreeSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            throw new Exception("not enough place");
        }
    }

 /*   public void setCar(Car[] car) {

        if (salary >= car.value) {
            System.out.println("Tou have a new car");
        } else if (salary > (car.value / 12)) {
            System.out.println("You have a new car and credit");
        } else {
            System.out.println("Find new job or go for get a raise");
            return;
        }
        this.garage = car;
    }
*/


}
