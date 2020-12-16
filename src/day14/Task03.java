package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task03 {
    public static void main(String[] args) {
        File file = new File("People");
        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (DataFormatException e) {
            System.out.println("Некорректный входной файл");
        }
    }
    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException, DataFormatException {
        Scanner scanner = new Scanner(file);
        String[] personParameters;
        List<Person> person = new ArrayList<>();
        while(scanner.hasNextLine()){
            personParameters = scanner.nextLine().split(" ");
            if (Integer.parseInt(personParameters[1])<0){
                throw new DataFormatException();
            }
            person.add(new Person(personParameters[0],Integer.parseInt(personParameters[1])));

        }
        return person;
    }
}
/*
Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
List<Person> parseFileToObjList() , который считывает содержимое того же
файла people.txt , создает экземпляры класса “Человек” и возвращает список
объектов. Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо
выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
выводить в консоль сообщение “Некорректный входной файл”.
Пример ответа: [{name='Mike', year=24}, {name='John', year=19},
{name='Anna', year=20}, {name='Miguel', year=5}]
 */