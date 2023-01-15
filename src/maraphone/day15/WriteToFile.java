package maraphone.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test2");
        PrintWriter pw = new PrintWriter(file);                                 // Запись только текстовых значений

        pw.println("Первая строка");                                           // вывод в файл
        pw.println("Вторая строка");
//        System.out.println(System.in);                                        // вывод в конcоль

        pw.close();
    }
}
