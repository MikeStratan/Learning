package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        File file = new File("People");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
    public static List<String> parseFileToStringList(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        List<String> people = new ArrayList<>();
        while(scanner.hasNextLine()){
            people.add(scanner.nextLine());
        }
        for(String person: people){
            String[] characteristicsPerson = person.split(" ");
            if(Integer.parseInt(characteristicsPerson[1])<0){
                throw new IOException();
            }
        }
        return people;
    }
}
/*
Создать в папке проекта файл people.txt в котором хранятся имена и возраст
людей. Реализовать статический метод
List<String> parseFileToStringList() , который считывает содержимое этого
файла и возвращает список, состоящий из значений имен и возрастов каждого
человека. Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо
выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
выводить в консоль сообщение “Некорректный входной файл”.
 */
