package maraphone.day4;

//        � ���������� �������� ����� n - ������ �������. ���������� ������� ������
//        ���������� ������� � ��������� ��� ���������� ������� �� 0 �� 10. ����� �������
//        ���������� ������� � �������, � ����� ������� � ������� ���������� �:
//        �) ����� �������
//        �) ���������� ����� ������ 8
//        �) ���������� ����� ������ 1
//        �) ���������� ������ �����
//        �) ���������� �������� �����
//        �) ����� ���� ��������� �������

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("������� ������ �������:");
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
        System.out.println("���������� � �������:");
        System.out.println("������ �������: "+n);
        System.out.println("���������� ����� ������ 8: "+counter8);
        System.out.println("���������� ����� ������ 1: "+counter1);
        System.out.println("���������� ������ �����: "+even);
        System.out.println("���������� �������� �����: "+(n-even));
        System.out.println("����� ��������� �������: "+summ);


    }
}
