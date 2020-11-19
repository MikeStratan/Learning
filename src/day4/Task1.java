package day4;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = s.nextInt();
        int[]  number = new int [size];
        int countMoreThatEight = 0;
        int countEqualOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;
        for (int i=0; i<size; i++) {
            number[i] = (int) (Math.random() * 10);
            if (number[i]>8){
                countMoreThatEight++;
            }
            if (number[i]==1) {
                countEqualOne++;
            }
            if (number[i]%2==0) {
                countEven++;
            } else {
                countOdd++;
            }
            sum+=number[i];
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Длина массива: "+number.length);
        System.out.println("Количество чисел больше 8: "+countMoreThatEight);
        System.out.println("Количество чисел равных 1: "+countEqualOne);
        System.out.println("Количество четных чисел: "+countEven);
        System.out.println("Количество нечетных чисел: "+countOdd);
        System.out.println("Сумма всех элементов: "+sum);

        }
        /*Необходимо создать массив
        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
        содержимое массива в консоль, а также вывести в консоль информацию о:
        а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
        е) Сумме всех элементов массива*/
}
