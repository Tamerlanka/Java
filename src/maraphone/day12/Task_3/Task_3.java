package maraphone.day12.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {

    public static List<MusicBand> groupsAfter2000(List<MusicBand>list) {
        List<MusicBand> sort = new ArrayList<>();
        for (MusicBand band : list) {
            if (band.getYear() < 2000) {
                sort.add(band);
            }
        }
        return sort;
    }
}

