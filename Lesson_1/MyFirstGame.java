public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 56;
        int playerNumber = 60;
        while (playerNumber != secretNum) {
            if (playerNumber > secretNum) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else if (playerNumber < secretNum) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}