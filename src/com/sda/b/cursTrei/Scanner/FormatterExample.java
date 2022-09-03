package com.sda.b.cursTrei.Scanner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatterExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDate localDate = LocalDate.now();

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh - mm");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh.mm");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter isoLocalTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;

        System.out.println("ISO: "+isoLocalTimeFormatter.format(localTime));

        System.out.println("----------------------");
        String formattedLocalTime = dateTimeFormatter.format(localTime);
        System.out.println("My pattern: "+formattedLocalTime);
        System.out.println("----------------------");


        //Formatting local date
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String formattedLocalDate = localDateFormatter.format(localDate);
        System.out.println("Formatted local date: "+formattedLocalDate);
        System.out.println("-----------");


    }
}
