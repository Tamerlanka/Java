package maraphone.day12;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("������");
        list.add("�����");
        list.add("�������");
        list.add("���������");
        list.add("������");
        System.out.println(list);
        list.add(2,"������");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
