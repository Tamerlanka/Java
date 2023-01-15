package maraphone.day12.Task_5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {                      // статический метод
        for (MusicArtist member : b.getMembers())
            a.getMembers().add(member);
            b.getMembers().clear();
    }
    public void transfer(MusicBand b) {                                         // не статический метод
        for (MusicArtist member : this.members)
             b.getMembers().add(member);
            this.members.clear();
    }

        public void printMembers(){
            System.out.println(this.members);
        }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
}