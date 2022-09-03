package com.sda.b.cursTrei.Scanner;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExamples {
    public static void main(String[] args) {

        System.out.println("\n"+"\n"+"----------------"+"\n");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data si ora: "+localDateTime);
        System.out.println("\n"+"\n"+"----------------"+"\n");
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 7, 24,14,54);
        System.out.println(localDateTime1);
        System.out.println("\n"+"\n"+"----------------"+"\n");
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, Month.AUGUST, 24,14,53,24);
        System.out.println("\n"+"\n"+"----------------"+"\n");

        LocalDateTime localDateTime5 = localDateTime1.plusDays(4).minusHours(5).plusMonths(13);
        System.out.println(localDateTime5);
        System.out.println("\n"+"\n"+"----------------"+"\n");

        System.out.println(localDateTime1.isAfter(localDateTime5));
        System.out.println("\n"+"\n"+"----------------"+"\n");


        System.out.println(localDateTime5.getYear());
        System.out.println(localDateTime5.getMonthValue());
        System.out.println(localDateTime5.getMonth());
        System.out.println(localDateTime5.getDayOfMonth());
        System.out.println("\n"+"\n"+"----------------"+"\n");

        System.out.println(localDateTime.withHour(14)); //totul e la fel, dar ora o sa fie 14
        System.out.println(localDateTime.plusHours(14)); //adauga 14 ore la valoarea existenta





    }

}
