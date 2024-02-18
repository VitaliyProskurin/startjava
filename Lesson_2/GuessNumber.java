import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int compNumber;
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        compNumber = r.nextInt(100) + 1;
        do {
            System.out.println(player1.getName() + " Введите выбранное число :");
            player1.setPlayerNumber(scan.nextInt());
            if (player1.getPlayerNumber() > compNumber) {
                System.out.println("Число " + player1.getPlayerNumber()
                    + " больше того, что загадал компьютер");
            } else if (player1.getPlayerNumber() < compNumber) {
                System.out.println("Число " + player1.getPlayerNumber()
                    + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player1.getName() + " угадал, загаданное число " + compNumber);
                break;
            }
            System.out.println(player2.getName() + " Введите выбранное число :");
            player2.setPlayerNumber(scan.nextInt());
            if (player2.getPlayerNumber() > compNumber) {
                System.out.println("Число " + player2.getPlayerNumber()
                    + " больше того, что загадал компьютер");
            } else if (player2.getPlayerNumber() < compNumber) {
                System.out.println("Число " + player2.getPlayerNumber()
                    + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player2.getName() + " угадал, загаданное число " + compNumber);
                break;
            }
        } while (true);
     }
}