package com.sda.tema.homeworkCoding.a;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task17 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        LocalDate now = LocalDate.now();

        System.out.println(now);

        System.out.println("When is your next SDA course?");
        String courseSDA = scanner.nextLine();
        LocalDate courseDate = LocalDate.parse(courseSDA);
        Period p = Period.between(now, courseDate);

        System.out.println("Duration is "+p.getDays());





    }
}
