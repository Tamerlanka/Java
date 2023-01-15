package maraphone.day12.Task_4;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String>members1 = new ArrayList<>();
        members1.add("Вася Кабыздох");
        members1.add("Оля Недает");

        MusicBand band1 = new MusicBand("Группа 2", 1979, members1);

        List<String>members2 = new ArrayList<>();
        members2.add("Настя Всемдала");
        members2.add("Петя Нестоит");

        MusicBand band2 = new MusicBand("Группа 3", 1987, members2);



//        band1.printMembers();
//        band2.printMembers();
//        band1.transfer(band2);
//        band1.printMembers();
//        band2.printMembers();
//        MusicBand.transferMembers(band1, band2);
//        band1.printMembers();
//        band2.printMembers();
    }
}
