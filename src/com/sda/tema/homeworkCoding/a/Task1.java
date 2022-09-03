package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert circle diameter: ");
        double diameter = scanner.nextDouble();
        System.out.println("Circle perimeter is: "+calculatePerimeter(diameter));
        System.out.println("Circle perimeter is: "+calculatePerim(diameter));

    }
    public static double calculatePerimeter (double diameter){
        return diameter * Math.PI;
    }
    public  static double calculatePerim (double diameter){
        return diameter * 3.14;
    }
}
