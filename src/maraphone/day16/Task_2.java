package maraphone.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        Random rand = new Random();

//        запись данных в file1

        for (int i=0; i<1000; i++){
            pw1.println(rand.nextInt(100));
        }
        pw1.close();

//        чтение из file1 и запись в file2

        int sum = 0;
            for(int j=0;j<50;j++) {
                for (int i = 0; i < 20; i++) {
                    sum += scanner.nextInt();
                }
                pw2.println((double)sum/20);
                sum=0;
            }
        pw2.close();
            printResult(file2);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double summ = 0;
        while (scanner.hasNextLine()) {
            summ += Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int)summ);
        scanner.close();
    }
}
