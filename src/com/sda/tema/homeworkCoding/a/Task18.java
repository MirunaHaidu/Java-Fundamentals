package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Say something...");
        String yourText = scanner.nextLine();


        if(yourText.matches("acho+!")){
            System.out.println("Bless you!");
        } else {
            System.out.println("Thank you for your message :)");
        }


    }
}
