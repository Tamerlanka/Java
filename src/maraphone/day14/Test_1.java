//package maraphone.day14;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Test_1 {
//    public static void main(String[] args) throws FileNotFoundException {
////        String separetor =File.separator;           // Обращаемся к константе разделителя пути к файлу. (тип слеша)
////
////
////        String path ="C:"+separetor+"Users"+separetor+"user"+separetor+"IdeaProjects"+separetor
////                +"new world"+separetor+"src"+separetor+"maraphone"+separetor+"day14";         // Путь к файлу
//        File file = new File("test.txt");                                 // В итоге отказало в доступе, ((((
//
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String[] numbersString = line.split(" ");
//        int[] numbers = new int[10];
//        int counter =0;
//        for(String number: numbersString) {
//            numbers[counter++] = Integer.parseInt(number);          // превращаем строки в числа
//        }
//
//        System.out.println(Arrays.toString(numbers));
//
//        scanner.close();
//    }
//}
