package maraphone.day4;

//        С клавиатуры вводится число n - размер массива. Необходимо создать массив
//        указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//        содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int counter8 = 0;
        int counter1 = 0;
        int even = 0;
        int summ = 0;
            for(int i = 0;i< array.length;i++){
                array[i] = rand.nextInt(10+0);
                if(array[i]>8) {
                    counter8++;
                }
                if(array[i]==1){
                    counter1++;
                }
                if(array[i]%2==0) {
                    even++;
                }
                summ +=array[i];
            }
        System.out.println(Arrays.toString(array));
        System.out.println("Информация о массиве:");
        System.out.println("Длинна массива: "+n);
        System.out.println("Количество чисел больше 8: "+counter8);
        System.out.println("Количество чисел равных 1: "+counter1);
        System.out.println("Количество четных чисел: "+even);
        System.out.println("Количество нечетных чисел: "+(n-even));
        System.out.println("Сумма элементов массива: "+summ);


    }
}
