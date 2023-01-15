package maraphone.day4;

//        Создать новый массив размера 100 и заполнить его случайными числами из
//        диапазона от 0 до 10000.
//        Затем, используя циклы for each вывести:
//        - наибольший элемент массива
//        - наименьший элемент массива
//        - количество элементов массива, оканчивающихся на 0
//        - сумму элементов массива, оканчивающихся на 0

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] array = new int[100];
        int max = 0;
        int min = 10000;
        int counter = 0;
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000 + 0);
        }
        for (int arrayI : array) {
            if (arrayI > max) {
                max = arrayI;
                }
                    if (arrayI < min) {
                    min = arrayI;
                    }
                        if (arrayI % 10 == 0) {
                        summ +=arrayI;
                        counter++;
                        }
            }
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println("Число элементов массива с окончанием на 0: "+counter);
        System.out.println("Сумма элементов массива оканчивающихся на 0 = "+summ);
        System.out.println(Arrays.toString(array));
    }
}