//package maraphone.day2;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¬ведите число этажей дома");
//        int x = scanner.nextInt();
//        if (1 <= x && x <= 4) {
//            System.out.println("Ёто малоэтажный дом");
//        } else if (5 <= x && x <= 8) {
//            System.out.println("Ёто среднеэтажный дом");
//        } else if (9 <= x) {
//            System.out.println("Ёто многоэтажный дом");
//        } else if (0 == x) {
//            System.out.println("ј дома-то нет!");
//        } else if (x < 0) {
//            System.out.println("Ёто не дом, это земл€нка, подвал или может быть шахта");
//        }
//    }
//}
//package maraphone.day2;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¬ведите первое число");
//        int a = scanner.nextInt();
//        System.out.println("7¬ведите второе число");
//        int b = scanner.nextInt();
//        for(int i=a;i<=b;++i) {
//            if (i%5 == 0) {
//                if (i%10 != 0) {
//                    System.out.print(i+" ");
//                }
//            }
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¬ведите первое число");
//        int a = scanner.nextInt();
//        System.out.println("¬ведите второе число");
//        int b = scanner.nextInt();
//
//        while(a<=b){
//            if (a%5 == 0) {
//                if (a%10 != 0) {
//                    System.out.print(a+" ");
//                    ++a;
//                } else {
//                    ++a;
//                }
//            } else {
//                ++a;
//            }
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("¬ведите переменную x");
//        double x = scanner.nextDouble();
//        if (x>=5) {
//            System.out.println("y = "+((x*x)-10)/(x+7));
//        } else if (-3>x&&x<5) {
//            System.out.println("y = "+(x+3)*((x*x)-2));
//        } else {
//            System.out.println("y = 420");
//        }
//    }
//}