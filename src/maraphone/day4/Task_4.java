package maraphone.day4;
//   ������� ����� ������ ������� 100 � ��������� ��� ���������� ������� ��
//   ��������� �� 0 �� 10000.
//   ����� �������� ����� ���� ���� �������� ���������. ��� ��������� ������ �
//   ������������ ������ �������� �������� ����� � ������ ������� �������� ������.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] array = new int[100];
        int summ =0;
        int temp =0;
        int flag =0;
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(10000+0);
        }
        for(int i=0;i< array.length-2;i++){
            temp = array[i]+array[i+1]+array[i+2];
            if(temp>summ){
                summ = temp;
                temp =0;
                flag = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("������������ ����� ������ ���������: "+summ);
        System.out.println("������ ������� �������� ���� ������: "+flag);
    }
}
