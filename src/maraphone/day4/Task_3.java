package maraphone.day4;

//        «аполнить двумерный массив (матрицу) случайными числами от 0 до 50. –азмер
//        матрицы задать m=12 , n=8 ( m - размерность по строкам, n - размерность по колонкам).
//        ¬ консоль вывести индекс строки, сумма чисел в которой максимальна. ≈сли таких
//        строк несколько, вывести индекс последней из них.

import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int summ1 = 0;
        int summ2 = 0;
        int counter = 0;
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50 + 0);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+array[i][j]);
                summ2 +=array[i][j];
                if(summ1<=summ2){
                    summ1=summ2;
                    counter =i;
                }
            }
            System.out.println("      //   "+summ2);
        }
        System.out.println("—умма чисел строки с индексом "+counter+" максимальна");
    }
}