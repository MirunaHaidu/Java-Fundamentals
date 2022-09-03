package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input a number: ");
        int yourNumber = scanner.nextInt();
        digitsSum(yourNumber);


    }
    public static void digitsSum(int number) {
        int sum = 0;
        int remainder =0;

        System.out.print("Digits sum is: ");
        while (number != 0) {
           remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println(sum);
    }
}
