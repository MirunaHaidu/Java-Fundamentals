package com.sda.tema.homeworkCoding.a;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int magicNumber = random.nextInt(100);
        System.out.println("(magic number =" + magicNumber + ")");

        System.out.println("Hello, let's play a game. Choose a number from 0 to 100");
        int chosenNumber = scanner.nextInt();

        while (chosenNumber != magicNumber) {
            if (chosenNumber > magicNumber) {
                System.out.println("Too much.");
                chosenNumber = scanner.nextInt();
            } else {
                System.out.println("Not enough.");
                chosenNumber = scanner.nextInt();
            }
        }
        System.out.println("Congratulations!");

    }
}
