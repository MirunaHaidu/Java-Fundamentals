package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something...");
        String yourText = scanner.nextLine();

        System.out.println("Space occurrence: " + spacePercentage(yourText));


    }

    public static double spacePercentage(String text) {

        double count = 0;
        char[] charArr = text.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                count++;
            }
        }
        return (count / charArr.length) * 100;


    }

}
