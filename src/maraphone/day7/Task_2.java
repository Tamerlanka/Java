package maraphone.day7;

public class Task_2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player.info();
        Player player2 = new Player();
        Player.info();
        Player player3 = new Player();
        Player.info();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();

        while (player6.getStamina() > 0) {
            player6.run();
        }

        Player player7 = new Player();
        Player.info();
    }
}