package day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Queen",1970));
        bands.add(new MusicBand("RHCP",1983));
        bands.add(new MusicBand("Cream Soda",2012));
        bands.add(new MusicBand("Oasis",1991));
        bands.add(new MusicBand("ARTBAT",2015));
        bands.add(new MusicBand("ХЛЕБ",2013));
        bands.add(new MusicBand("Depeche Mode",1980));
        bands.add(new MusicBand("Lumen",1998));
        bands.add(new MusicBand("Above & Beyond",2000));
        bands.add(new MusicBand("The Chemical Brothers",1989));
        bands.add(new MusicBand("U2",1976));

        List<MusicBand> groupsAfter2000 = groupsAfter2000(bands);
        for(MusicBand band: bands){
            System.out.println(band);
        }
        System.out.println("Группы после 2000:");
        for(MusicBand band: groupsAfter2000){
            System.out.println(band);
        }
    }
    public static List<MusicBand> groupsAfter2000 (List < MusicBand > bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for(MusicBand band: bands){
            if (band.getYear()>=2000){
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}

class MusicBand{
    private final String name;
    private final int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
/*
Создать класс Музыкальная Группа (англ. MusicBand ) с полями name и year
(название музыкальной группы и год основания). Создать 10 или более экземпляров
класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
список. Создать статический метод в классе Task3 :
public static List<MusicBand> groupsAfter2000(List<MusicBand>
bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список,
состоящий из групп, основанных после 2000 года. Вызвать метод
groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
после 2000 года).
 */
