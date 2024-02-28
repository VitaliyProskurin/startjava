package com.startjava.lesson_2_3.guess;

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
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int secretNum = r.nextInt(100) + 1;
        do {
            System.out.println("\n" + player1.getName() + " Введите выбранное число :");
            int numberPlayer1 = scan.nextInt();
            if (numberPlayer1 > secretNum) {
                System.out.println("Число " + numberPlayer1 
                    + " больше того, что загадал компьютер");
            } else if (numberPlayer1 < secretNum) {
                System.out.println("Число " + numberPlayer1 
                    + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player1.getName() + " угадал, загаданное число " + secretNum);
                break;
            }
            System.out.println("\n" + player2.getName() + " Введите выбранное число :");
            int numberPlayer2 = scan.nextInt();
            if (numberPlayer2 > secretNum) {
                System.out.println("Число " + numberPlayer2 
                    + " больше того, что загадал компьютер");
            } else if (numberPlayer2 < secretNum) {
                System.out.println("Число " + numberPlayer2 
                    + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player2.getName() + " угадал, загаданное число " + secretNum);
                break;
            }
        } while (true);
     }
}