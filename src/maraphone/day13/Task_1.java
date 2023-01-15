package maraphone.day13;

public class Task_1 {
    public static void main(String[] args) {
        User user1 = new User("Настя");
        User user2 = new User("Мама");
        User user3 = new User("Папа");

        user1.sendMessage(user2, "Я беременна!");
        user2.sendMessage(user1, "Кто отец?");
        user1.sendMessage(user2, "Вася или Коля, может Вова... не знаю");
        user2.sendMessage(user1, "Выбирай любого, но быстро. Главное, что не Гена");
        user1.sendMessage(user2, "Почему?");
        user2.sendMessage(user1, "Потому что он негр!");

        user3.sendMessage(user1, "У тебя все в порядке?");
        user1.sendMessage(user3, "Да, а что?");
        user3.sendMessage(user1, "Я нашел тест на беременность в ванной");
        user1.sendMessage(user3, "Ой");
        user1.sendMessage(user3, "Это не мое...");
        user3.sendMessage(user1, "Ясно, значет матери. Скажи ей, что я ушел на войну...");

        MessageDatabase.showDialog(user1, user3);
    }
}
