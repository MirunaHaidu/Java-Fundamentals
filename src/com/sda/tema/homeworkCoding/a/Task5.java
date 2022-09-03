package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number ");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int number) {
        if (number == 1 || number == 0){
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
