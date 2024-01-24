public class MyFirstGame {
    public static void main(String[] args) {
        int numberPc = 56;
        int numberUser = 60;
        while (numberUser != numberPc) {
            if (numberUser > numberPc) {
                System.out.println("Число " + numberUser + " больше того, что загадал компьютер");
                numberUser--;
            } else if (numberUser < numberPc) {
                System.out.println("Число " + numberUser + " меньше того, что загадал компьютер");
                numberUser++;
            }
        }
        System.out.println("Вы победили!");
    }
}