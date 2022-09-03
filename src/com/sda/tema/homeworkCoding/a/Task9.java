package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c, y, a, b, d, n, wh, wl;

        System.out.println("Wave length: ");
        int row = scanner.nextInt();

        //outer for loop
        a = 2;
        b = 1;
        wh = row;
        wl = row;

        // loop for height of wave
        for ( int i = 0; i < wh; i++) {
            for (c = wh; c <= wh + i; c++) {
                System.out.print(" ");
            }
            //  loop for wave length
            for (d = 1; d <= wl; d++) {
                for (n = (wh + wh - 2); n >= b; n--)
                    System.out.print(" ");
                for (c = 1; c <= a; c++) {
                    if (c == 1)
                        System.out.print("*");
                    else if (c == a)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            // incrementing counters value by two
            b = b + 2;
            a = a + 2;
            System.out.println();
        }


    }

}
