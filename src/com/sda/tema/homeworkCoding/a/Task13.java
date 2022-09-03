package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something...");
        String yourText = scanner.nextLine();

        stutter(yourText);

    }
    public static void stutter (String text){
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i]+" "+ words[i]+" ");
        }
    }
}
