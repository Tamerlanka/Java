package maraphone.day12.Task_5;

import java.util.ArrayList;
import java.util.List;

public class Task_5  {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("���� ��������", 13));
        members1.add(new MusicArtist("��� ������", 15));

        MusicBand band1 = new MusicBand("������ 2", 1979, members1);

        List<MusicArtist>members2 = new ArrayList<>();
        members2.add(new MusicArtist("����� ��������", 42));
        members2.add(new MusicArtist("���� �������", 53));

        MusicBand band2 = new MusicBand("������ 3", 1987, members2);

        System.out.println(band1);
        System.out.println(band2);

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

