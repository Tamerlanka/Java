package maraphone.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("test.txt");                  // 1. подключаем сторонний файл из папки проекта

        try {
            Scanner scanner = new Scanner(file);                // 2.Готовимся принять данные сканнером, обрабатываем исключения

            String line = scanner.nextLine();                   // 3. В файле 1 строка, считываем её.
            String[] numbers = line.split(" ");       //4. В массив строк вносим данные разделенные пробелом.

            if(numbers.length != 11)                          //8 проверяем размер массива
                throw new IllegalAccessException();                 //10. выбрасываем исключение если массив не равен 10

            int sum = 0;                        //5.    Создаем переменную в которой будем считать сумму
        for(String number: numbers) {                     //6. перебираем массив строк
            sum += Integer.parseInt(number);          // 7. превращаем строки в числа
        }
            System.out.println(sum);

        } catch (FileNotFoundException e) {                         // 9.обрабатываем исключение если файл не найден
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный входной файл");        // 11 обрабатываем исключение если массив не равен 10
        }

    }
}
