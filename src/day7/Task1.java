package day7;

import day7.Airplane;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Bowing",1990,50, 14000);
        Airplane airplane2 = new Airplane("Bowing",1990,25, 14000);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
