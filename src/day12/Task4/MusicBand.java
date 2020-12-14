package day12.Task4;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members;
    }

    public static void transferMembers(MusicBand bandA,MusicBand bandB){
        for(String member: bandA.getMembers())
            bandB.getMembers().add(member);
        bandA.getMembers().clear();
    }
    public static void printMembers(MusicBand band){
            System.out.println(band);
        }
}
/*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
группу можно было добавлять и удалять участников. Под участником понимается
строка ( String ) с именем и фамилией. Реализовать статический метод слияния групп
(в классе MusicBand ), т.е. все участники группы А переходят в группу B . Название
метода: transferMembers . Этот метод принимает в качестве аргументов два
экземпляра класса MusicBand . Реализовать метод printMembers (в классе
MusicBand ), выводящий список участников в консоль. Проверить состав групп после
слияния.
 */