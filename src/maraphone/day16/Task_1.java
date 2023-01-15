package maraphone.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        printResult(file);

    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int sum = 0;
        int counter = 0;
        for (String number: numbers) {
            sum += Integer.parseInt(number);
            counter++;
        }
        double result = (double) sum/counter;
        System.out.println(Arrays.toString(numbers));
        System.out.printf(result+"-->%.3f",result);


    }
}
