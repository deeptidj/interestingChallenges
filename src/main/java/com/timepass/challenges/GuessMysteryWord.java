package com.timepass.challenges;

import java.util.Scanner;

public class GuessMysteryWord {
    public static int lives = 9;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to play a mystery game? y/N");
        String input = scan.next();
        if (input == "y") {
            System.out.println("Let's start the game");

        } else {
            return;
        }
    }
}
