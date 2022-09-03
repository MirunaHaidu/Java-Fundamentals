package com.sda.b.cursTrei.Scanner;

import java.time.LocalTime;

public class LocalTimeExamples {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);


        System.out.println(localTime.plusHours(3));
        System.out.println(localTime.plusMinutes(10));

       LocalTime localtime2 = localTime.plusMinutes(120).minusSeconds(180).plusMinutes(10);
        System.out.println(localtime2);
        System.out.println("----------------------");
        LocalTime l1 = LocalTime.now();
        LocalTime l2 = LocalTime.now().plusHours(1);
        System.out.println("l1: "+l1);
        System.out.println("l2: "+l2);
        System.out.println("L1 after l2: "+l1.isAfter(l2));
        System.out.println("L1 before l2: "+l1.isBefore(l2));
        System.out.println("----------------------");

        LocalTime specificLocalTime1 = LocalTime.of(18, 15);
        LocalTime specificLocalTime2 = LocalTime.of(18, 15,10);
        LocalTime specificLocalTime3 = LocalTime.of(18,15,10,100);
        System.out.println("1: "+specificLocalTime1);
        System.out.println("2: "+specificLocalTime2);
        System.out.println("3: "+specificLocalTime3);


    }
}
