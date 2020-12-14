package day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Ока","Нива","ВАЗ","ГАЗ","ЛИАЗ"));
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("------------");
        cars.add(3,"БеЛАЗ");
        cars.remove(0);
        for(String car : cars) {
            System.out.println(car);
        }
    }
}
/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
из списка. Распечатать список.
 */