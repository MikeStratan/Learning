package day6;

import day6.*;

public class Task1 {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle(1994,"Red","Honda Steed");
        System.out.println(motorcycle1.yearDifference(1996));
        motorcycle1.info();
        Car car1 = new Car();
        car1.setYear(1967);
        car1.setColour("Red");
        car1.setModel("Shelby Mustang");
        System.out.println(car1.yearDifference(1996));
        car1.info();
    }
}
