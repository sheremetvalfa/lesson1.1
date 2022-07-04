package com.company;

import com.company.details.Engine;
import com.company.entities.Person;
import com.company.vehicles.Car;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        Person person1 = new Person("Vasil",30,"men","3809777777");
        car.toString("BMW","X3",200000,"DDriver", "Engine","Pavel");
        System.out.println(person1);
    }


}
