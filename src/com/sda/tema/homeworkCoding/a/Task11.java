package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;
import java.util.ArrayList;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yourText = "";
        ArrayList<String> yourStrings = new ArrayList<>();

        while (!(yourText.equals("Enough!"))) {
            yourText = scanner.nextLine();
            yourStrings.add(yourText);
        }
        yourStrings.remove("Enough!");
        if (yourStrings.isEmpty()) {
            System.out.println("No text provided");
            return;
        }


        String largestString = yourStrings.get(0);
        for (String yourString : yourStrings) {
            if (yourString.length() > largestString.length()) {
                largestString = yourString;
            }
        }

        System.out.println(largestString);

    }

}


