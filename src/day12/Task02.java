package day12;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<16;i++){
            numbers.add(i*2);
        }
        for(int i=150;i<176;i++){
            numbers.add(i*2);
        }
        for(Number num: numbers){
            System.out.println(num);
        }
    }
}
/*
Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Вывести список.
 */