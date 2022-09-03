package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What index?");
        int number = scanner.nextInt();

        System.out.println("Number at index "+number+ " is "+calculateFibonacci(number));


    }
    public static int calculateFibonacci(int number) {
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i < number; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
