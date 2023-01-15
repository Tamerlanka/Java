package maraphone.day6;

public class Task_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("audi");
        car.setColor("white");
        car.setYearOld(2000);
        car.info();
        System.out.println(car.yearDifference(2022));

        Motorbike motorbike = new Motorbike(1924, "black", "BMW");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2022));
    }
}
