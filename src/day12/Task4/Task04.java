package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        List<String> membersA = new ArrayList<>();
        membersA.add("Алексей Конь");
        membersA.add("Сергей Лось");
        membersA.add("Семен Хомяк");
        MusicBand bandA = new MusicBand("Волки", 2020, membersA);
        List<String> membersB = new ArrayList<>();
        membersB.add("Алексей Мышь");
        membersB.add("Сергей Зверев");
        membersB.add("Семен Сусликов");
        MusicBand bandB = new MusicBand("Петухи", 2020, membersB);
        MusicBand.printMembers(bandA);
        MusicBand.printMembers(bandB);
        MusicBand.transferMembers(bandA,bandB);
        System.out.println("------после перехода--------");
        MusicBand.printMembers(bandA);
        MusicBand.printMembers(bandB);

    }
}


