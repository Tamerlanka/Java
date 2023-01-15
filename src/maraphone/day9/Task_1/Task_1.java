package maraphone.day9.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        Student student = new Student("Вася", "группа-13");
        Teacher teacher = new Teacher("Иван Петрович", "Проктология");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
