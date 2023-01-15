package maraphone.day12.Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Группа 1", 1960);
        MusicBand band2 = new MusicBand("Группа 2", 1979);
        MusicBand band3 = new MusicBand("Группа 3", 1987);
        MusicBand band4 = new MusicBand("Группа 4", 1992);
        MusicBand band5 = new MusicBand("Группа 5", 1999);
        MusicBand band6 = new MusicBand("Группа 6", 2000);
        MusicBand band7 = new MusicBand("Группа 7", 2006);
        MusicBand band8 = new MusicBand("Группа 8", 2007);
        MusicBand band9 = new MusicBand("Группа 9", 2018);
        MusicBand band10 = new MusicBand("Группа 10", 2021);

        List<MusicBand> list = new ArrayList<>(10);
        list.add(band1);
        list.add(band2);
        list.add(band3);
        list.add(band4);
        list.add(band5);
        list.add(band6);
        list.add(band7);
        list.add(band8);
        list.add(band9);
        list.add(band10);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        List<MusicBand> listing = new ArrayList<>();
        for (MusicBand band : list) {
            if (band.getYear() < 2000)
                listing.add(band);
        }
        System.out.println(listing);
    }
}