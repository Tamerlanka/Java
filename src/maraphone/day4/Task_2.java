package maraphone.day4;

//        ������� ����� ������ ������� 100 � ��������� ��� ���������� ������� ��
//        ��������� �� 0 �� 10000.
//        �����, ��������� ����� for each �������:
//        - ���������� ������� �������
//        - ���������� ������� �������
//        - ���������� ��������� �������, �������������� �� 0
//        - ����� ��������� �������, �������������� �� 0

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
        System.out.println("���������� ������� �������: "+max);
        System.out.println("���������� ������� �������: "+min);
        System.out.println("����� ��������� ������� � ���������� �� 0: "+counter);
        System.out.println("����� ��������� ������� �������������� �� 0 = "+summ);
        System.out.println(Arrays.toString(array));
    }
}