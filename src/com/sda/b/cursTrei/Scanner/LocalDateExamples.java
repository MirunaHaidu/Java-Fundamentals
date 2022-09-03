package com.sda.b.cursTrei.Scanner;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExamples {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date: "+localDate);

        LocalDate specificLocalDate1 = LocalDate.of(2022, 8, 22);
        System.out.println("Specific local date: "+specificLocalDate1);

        LocalDate specificLocalDate2 = LocalDate.of(2022, Month.AUGUST, 22);
        System.out.println("Specific local date2: "+specificLocalDate2);


        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.plusDays(5));
        System.out.println(localDate1.plusMonths(2));
        System.out.println(localDate1.plusYears(50));

    }
}
