package maraphone.day6;

public class Task_2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2020, 40,15000);
        airplane1.info();
        airplane1.setYear(2022);
        airplane1.setLength(48);
        airplane1.fillUp(4000);
        airplane1.fillUp(7000);
        airplane1.info();
    }
}
