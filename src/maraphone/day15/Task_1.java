package maraphone.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("hlam.txt");
        File file2 = new File("hlam2.txt");
        PrintWriter pw = new PrintWriter(file2);


        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            String[] datas = scanner.nextLine().split(";");
            if (Integer.parseInt(datas[2]) == 0) {
                System.out.println(datas[0]);
                pw.println(datas[0] + " " + datas[1] + " " + datas[2]);
            }
        }
            pw.close();
            scanner.close();
        }
    }
