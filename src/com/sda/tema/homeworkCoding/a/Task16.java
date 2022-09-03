package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        int[] arr = new int[10];
        int lastPreviousNumber = Integer.MIN_VALUE;
        int counter = 0;
        int maxLength = -1;

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > lastPreviousNumber) {
                ++counter;
            } else {
                if (counter > maxLength) {
                    maxLength = counter;
                }
                counter = 1;
            }
            lastPreviousNumber = arr[i];

        }
        System.out.println(counter);


    }

}
