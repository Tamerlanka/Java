package maraphone.day7;

public class Task_1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 1998, 35, 23000);
        Airplane airplane2 = new Airplane("Tu", 1972, 43, 37000);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
