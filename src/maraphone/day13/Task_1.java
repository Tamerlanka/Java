package maraphone.day13;

public class Task_1 {
    public static void main(String[] args) {
        User user1 = new User("�����");
        User user2 = new User("����");
        User user3 = new User("����");

        user1.sendMessage(user2, "� ���������!");
        user2.sendMessage(user1, "��� ����?");
        user1.sendMessage(user2, "���� ��� ����, ����� ����... �� ����");
        user2.sendMessage(user1, "������� ������, �� ������. �������, ��� �� ����");
        user1.sendMessage(user2, "������?");
        user2.sendMessage(user1, "������ ��� �� ����!");

        user3.sendMessage(user1, "� ���� ��� � �������?");
        user1.sendMessage(user3, "��, � ���?");
        user3.sendMessage(user1, "� ����� ���� �� ������������ � ������");
        user1.sendMessage(user3, "��");
        user1.sendMessage(user3, "��� �� ���...");
        user3.sendMessage(user1, "����, ������ ������. ����� ��, ��� � ���� �� �����...");

        MessageDatabase.showDialog(user1, user3);
    }
}
