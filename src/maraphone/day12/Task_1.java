package maraphone.day12;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Жигули");
        list.add("Волга");
        list.add("Москвич");
        list.add("Запорожец");
        list.add("Газель");
        System.out.println(list);
        list.add(2,"Победа");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
