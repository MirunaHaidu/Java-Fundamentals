package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("First letter is: ");
        char first = scanner.next().charAt(0);
        System.out.println("Second letter is: ");
        char second = scanner.next().charAt(0);

        char firstLow = Character.toLowerCase(first);
        char secondLow = Character.toLowerCase(second);


        System.out.println("There are "+numberOfLettersBetween(firstLow, secondLow)
                +" letters in the alphabet between them.");


    }
    public static int numberOfLettersBetween (int a, int b){
        if (a == b){
            return 0;
        }
        return Math.abs(b-a) -1;
    }
}
