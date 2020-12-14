package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        membersA.add(new MusicArtist("Алексей Конь", 21));
        membersA.add(new MusicArtist("Сергей Лось",56));
        membersA.add(new MusicArtist("Семен Хомяк",31));
        MusicBand bandA = new MusicBand("Волки", 2020, membersA);
        List<MusicArtist> membersB = new ArrayList<>();
        membersB.add(new MusicArtist("Алексей Мышь",19));
        membersB.add(new MusicArtist("Сергей Зверев",15));
        membersB.add(new MusicArtist("Семен Сусликов", 45));
        MusicBand bandB = new MusicBand("Петухи", 2020, membersB);
        MusicBand.printMembers(bandA);
        MusicBand.printMembers(bandB);
        MusicBand.transferMembers(bandA,bandB);
        System.out.println("------после перехода--------");
        MusicBand.printMembers(bandA);
        MusicBand.printMembers(bandB);

    }
}
/*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника
музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
участником понимается не строка, а объект класса MusicArtist . Необходимо
реализовать класс MusicArtist и доработать класс MusicBand (создать копию
класса) таким образом, чтобы участники были - объекты класса MusicArtist . После
этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
проверить состав групп после слияния. Методы для слияния и для вывода участников
в консоль необходимо тоже переработать, чтобы они работали с объектами класса
MusicArtist .
 */