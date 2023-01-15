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
            System.out.println("����� �� ����. ������������: "+this.stamina);
        } else {
            System.out.println("��� ����� ������� ������");
        }
    }
        public static void info(){
            System.out.println("����� ������� �� ���� "+Player.countPlayers);
            if(Player.countPlayers<6) {
                System.out.println("������� �� ������!");
                switch (6-Player.countPlayers){
                    case 1:
                        System.out.println("���� ���� ��������� �����!");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("���� "+(6-Player.countPlayers)+" ��������� �����");
                        break;
                    case 5:
                    case 6:
                        System.out.println("���� "+(6-Player.countPlayers)+" ��������� ����");
                }
            }
        }
        public void run() {
//        if(this.stamina!=0)
            System.out.println("����� �����");
            this.stamina--;
            System.out.println("������������ "+this.stamina);
            if (this.stamina == 0){
                System.out.println("����� ����� � ������ � ����.");
            Player.countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }
}