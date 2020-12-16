package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "M&M's" + separator + "Desktop" + separator + "Test.txt";
        File file = new File(path);

        try {
            printResult(file);
            float average = (float) printResult(file);
            System.out.println(average);
            System.out.printf("%.3f%n", average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static double printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        int sum=0;
        float average;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        average = (float)sum/numbers.length;
        return average;
    }
}
/*
Реализовать программу, которая на вход принимает txt файл с целыми числами
(можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
консоль среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести полную
запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
(с 3 знаками после запятой).
Детали реализации: В классе Task1 создать публичный статический метод
printResult(File file) , в котором реализовать вышеописанную логику. В методе
main() класса Task1 вызвать метод printResult(File file) , передав ему в
качестве аргумента объект класса File ( txt файл с целыми числами).
Пример:
Числа в txt файле: 5 2 8 34 1 36 77
Ответ: 23.285714285714285 --> 23,286
 */
