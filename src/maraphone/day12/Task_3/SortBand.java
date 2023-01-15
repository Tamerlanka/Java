package maraphone.day12.Task_3;

import java.util.List;

public class SortBand {
    private String name;
    private int year;

    public SortBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public SortBand(List<MusicBand> list) {
    }

    @Override
    public String toString() {
        return "SortBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
