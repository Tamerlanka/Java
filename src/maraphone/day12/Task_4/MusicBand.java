package maraphone.day12.Task_4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {                      // ����������� �����
        for (String member : b.getMembers())
            a.getMembers().add(member);
            b.getMembers().clear();
    }
    public void transfer(MusicBand b) {                                         // �� ����������� �����
        for (String member : this.members)
             b.getMembers().add(member);
            this.members.clear();
    }

        public void printMembers(){
            System.out.println(this.members);
        }

            @Override
            public String toString () {
            return "MusicBand{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", members=" + members +
                    '}';
        }

            public String getName () {
            return name;
        }

            public void setName (String name){
            this.name = name;
        }

            public int getYear () {
            return year;
        }

            public void setYear ( int year){
            this.year = year;
        }

            public List<String> getMembers () {
            return members;
        }

            public void setMembers (List < String > members) {
            this.members = members;
        }
}