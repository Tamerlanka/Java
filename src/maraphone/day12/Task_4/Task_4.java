package maraphone.day12.Task_4;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String>members1 = new ArrayList<>();
        members1.add("���� ��������");
        members1.add("��� ������");

        MusicBand band1 = new MusicBand("������ 2", 1979, members1);

        List<String>members2 = new ArrayList<>();
        members2.add("����� ��������");
        members2.add("���� �������");

        MusicBand band2 = new MusicBand("������ 3", 1987, members2);



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
