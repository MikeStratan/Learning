package day12.Task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        for(MusicArtist member: bandA.getMembers())
            bandB.getMembers().add(member);
        bandA.getMembers().clear();
    }
    public static void printMembers(MusicBand band){
        System.out.println(band);
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