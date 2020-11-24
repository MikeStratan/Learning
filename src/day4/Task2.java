package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int[]  number = new int [100];
        int numberLargest = 0;
        int numberSmallest = 10000;
        int countEndsZero = 0;
        int sumEndsZero = 0;
        for (int i=0; i<100; i++) {
            number[i] = (int) (Math.random() * 10000);
        }
            for(int array:number){
                if (array>numberLargest){
                    numberLargest = array;
                }
                if (array<numberSmallest) {
                    numberSmallest = array;
                }
                if (array%10==0) {
                    countEndsZero++;
                    sumEndsZero+=array;
                }
            }
        System.out.println(Arrays.toString(number));
        System.out.println("наибольший элемент массива: "+numberLargest);
        System.out.println("наименьший элемент массива: "+numberSmallest);
        System.out.println("количество элементов массива, оканчивающихся на 0: "+countEndsZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: "+sumEndsZero);
    }
    /* Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено. */
}
