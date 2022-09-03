package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a positive number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
