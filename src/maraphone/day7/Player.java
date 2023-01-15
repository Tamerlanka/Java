package maraphone.day7;

import java.util.Random;

public class Player {
    Random rand = new Random();
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        if (Player.countPlayers < 6) {
            this.stamina = rand.nextInt(10) + 90;
            Player.countPlayers++;
            System.out.println("Игрок на поле. Выносливость: "+this.stamina);
        } else {
            System.out.println("Все места игроков заняты");
        }
    }
        public static void info(){
            System.out.println("Число игроков на поле "+Player.countPlayers);
            if(Player.countPlayers<6) {
                System.out.println("Команды не полные!");
                switch (6-Player.countPlayers){
                    case 1:
                        System.out.println("Есть одно свободное место!");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Есть "+(6-Player.countPlayers)+" свободных места");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Есть "+(6-Player.countPlayers)+" свободных мест");
                }
            }
        }
        public void run() {
//        if(this.stamina!=0)
            System.out.println("Игрок бежит");
            this.stamina--;
            System.out.println("Выносливость "+this.stamina);
            if (this.stamina == 0){
                System.out.println("Игрок устал и уходит с поля.");
            Player.countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }
}