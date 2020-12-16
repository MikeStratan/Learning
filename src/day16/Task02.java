package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        StringBuilder line = new StringBuilder();
        for(int i=0; i<1000; i++){
            line.append((int)(Math.random() * 1000)).append(" ");
        }
        try {
            PrintWriter pw1 = new PrintWriter(file1);
            pw1.println(line);
            pw1.close();
            Scanner scanner1 = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            String[] numbers = scanner1.nextLine().split(" ");
            int counter = 0;
            int sum=0;
            for(String number : numbers){
                sum+=Integer.parseInt(number);
                counter++;
                if(counter==20){
                    pw2.print(sum/20+" ");
                    counter = 0;
                }
            }
            scanner1.close();
            pw2.close();
            System.out.println((int)printResult(file1));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
    public static float printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] numbers = scanner.nextLine().split(" ");
        float sum=0;
        for(String number: numbers) {
            sum+=Float.parseFloat(number);
        }
        return sum;
    }
}
/*
Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
Оба файла должны находиться в корне проекта. Создаваться файлы должны не
вручную, а при запуске программы.
Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо реализовать статический
метод printResult(File file) . Этот метод должен рассчитать сумму всех
вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
часть.
Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое
рассчитывается для группы из 4 целых чисел.
Файл 1 : 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2 : 5.75 26.5 34.5
Ответ : 66
Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из
Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66 .
 */