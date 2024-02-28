package com.startjava.lesson_2_3.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        
        do {
            game.play();
            do {
                System.out.println("\nХотите заново начать игру? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("no") && !choice.equals("yes"));
        } while (choice.equals("yes"));
    }
}