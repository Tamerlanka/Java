package maraphone.day5;

public class Task_1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOld(2008);
        car1.setColor("black");
        car1.setModel("Audi TT");

        System.out.println("����������: "+car1.getModel()+" "+car1.getYearOld()+" ����. ����: "+car1.getColor());

        System.out.print("\u2652");

    }
}