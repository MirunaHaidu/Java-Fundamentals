package com.sda.b.cursTrei.Scanner;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class IntervalsExamples {
    public static void main(String[] args) {
        Duration duration = Duration.ofHours(5);
        Period period = Period.of(1, 1, 1);
        System.out.println(duration);
        System.out.println(period);

        System.out.println(duration.plusHours(5));
        System.out.println(duration.plusHours(1).plusMinutes(34).plusSeconds(2));
        System.out.println("-------------");
        System.out.println(duration.minus(Duration.ofMinutes(15)));
        System.out.println("-------------");

        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now()).plusHours(10));
        System.out.println("-------------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plus(Duration.ofMinutes(10)));
        System.out.println("-------------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.plus(Period.ofWeeks(1)));
        System.out.println(localDate);
        System.out.println(localDate.minus(Period.ofDays(6)));
        System.out.println("----------");
        localDate = localDate.plus(Period.ofWeeks(1));
        System.out.println(localDate);
        System.out.println(localDate.minus(Period.ofDays(6)));


    }
}
