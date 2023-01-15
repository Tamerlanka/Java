package maraphone.day6;

public class Task_3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.Prepod("Буканов И.И.", "Слоноведение");
        Student student1 = new Student();
        student1.setName("Лошаков Илья");
        teacher1.evaluate(student1);
    }
}
