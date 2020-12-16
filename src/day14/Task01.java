package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "M&M's" + separator + "Desktop" + separator + "Test.txt";
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        assert scanner != null;
        scanner.close();
    }

    public static void printSumDigits(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        if (numbersString.length != 10) {
            throw new IOException();
        }
        int[] numbers = new int[numbersString.length];
        int counter = 0;
        int sum = 0;
        for (String number : numbersString) {
            numbers[counter] = Integer.parseInt(number);
            sum += numbers[counter];
            counter++;
        }
        System.out.println(sum);
    }
}
/*
Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать статический
метод printSumDigits(File file) , который считает сумму всех чисел в этом
файле и выводит ее на экран. Вызвать данный метод в методе main().
Если файла не существует в папке проекта, в программе необходимо выбрасывать
исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
выводить в консоль сообщение “Некорректный входной файл”.
 */