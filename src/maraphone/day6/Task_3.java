package maraphone.day6;

public class Task_3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.Prepod("������� �.�.", "������������");
        Student student1 = new Student();
        student1.setName("������� ����");
        teacher1.evaluate(student1);
    }
}
