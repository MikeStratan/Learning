package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String [] args) {
        int[] number = new int[100];
        int numberMaxSum = 0;
        int pointer = 0;
        for (int i = 0; i < 100; i++) {
            number[i] = (int) (Math.random() * 10000);
            if (i>2)
            {
                if (numberMaxSum<number[i]+number[i-1]+number[i-2]){
                    numberMaxSum = number[i]+number[i-1]+number[i-2];
                    pointer = i-2;
                }
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Максимум среди сумм трех соседних элементов: "+numberMaxSum);
        System.out.println("Индекс первого элемента тройки: "+pointer);
    }
    /*
   Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
максимальной суммой выведите значение суммы и индекс первого элемента тройки.
     */
}
