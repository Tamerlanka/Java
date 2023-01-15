package maraphone.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("test.txt");                  // 1. ���������� ��������� ���� �� ����� �������

        try {
            Scanner scanner = new Scanner(file);                // 2.��������� ������� ������ ���������, ������������ ����������

            String line = scanner.nextLine();                   // 3. � ����� 1 ������, ��������� �.
            String[] numbers = line.split(" ");       //4. � ������ ����� ������ ������ ����������� ��������.

            if(numbers.length != 11)                          //8 ��������� ������ �������
                throw new IllegalAccessException();                 //10. ����������� ���������� ���� ������ �� ����� 10

            int sum = 0;                        //5.    ������� ���������� � ������� ����� ������� �����
        for(String number: numbers) {                     //6. ���������� ������ �����
            sum += Integer.parseInt(number);          // 7. ���������� ������ � �����
        }
            System.out.println(sum);

        } catch (FileNotFoundException e) {                         // 9.������������ ���������� ���� ���� �� ������
            System.out.println("���� �� ������");
        } catch (IllegalAccessException e) {
            System.out.println("������������ ������� ����");        // 11 ������������ ���������� ���� ������ �� ����� 10
        }

    }
}
