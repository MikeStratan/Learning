package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src"+separator+"main"+separator+"resources"+separator+"shoes.csv";
        File file = new File(path);
        File newFile = new File("src"+separator+"main"+separator+"resources"+separator+"missing_shoes.txt");
        PrintWriter pw = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            pw = new PrintWriter(newFile);
            String[] modelParameters;
            while(scanner.hasNextLine()){
                modelParameters = scanner.nextLine().split(";");
                if(Integer.parseInt(modelParameters[2])==0){
                    pw.println(modelParameters[0]+", "+modelParameters[1]+", "+modelParameters[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        assert pw != null;
        pw.close();
        scanner.close();
    }
}

/*
Вам дан файл с информацией об остатках обуви на складе
(src/main/resources/shoes.csv) . Это пример реальной выгрузки остатков из 1С
в csv файл (формат файла с разделителями, в качестве разделителя использован
символ “;”). В этом файле содержится информация о названии модели обуви, ее
размер и оставшееся на складе количество.
До преобразования в csv это была таблица с тремя колонками:
Название Размер Кол-во
Ботинки HS РАН-Р 400 чер. ЗП 45 4
Ботинки PANDA САНИТАРИ 3916 S1 SRC бел. 37 1
...
Необходимо сформировать новый файл
(src/main/resources/missing_shoes.txt) с информацией о моделях и
размерах обуви, которой нет на складе (количество = 0) . Для этого реализуйте
программу, которая принимает на вход csv файл и создает новый txt файл
следующего содержания (должно получиться 11 строк):
Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 */
