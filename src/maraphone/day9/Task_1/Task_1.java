package maraphone.day9.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        Student student = new Student("����", "������-13");
        Teacher teacher = new Teacher("���� ��������", "�����������");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
