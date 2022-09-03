package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number ");
        int yourNumber = scanner.nextInt();
        harmonicSeries(yourNumber);

    }

    public static void harmonicSeries(int number) {
        float sum = 0f;

        for (int i = 1; i <= number; i++) {
            sum = sum +   1f / i;
        }
        System.out.print("Sum of harmonic series is: "+sum);
    }
}
