package com.sda.tema.homeworkCoding.a;

public class Task3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 1;

//        System.out.println(calculateDelta(a, b, c));
//        System.out.println(-b - Math.sqrt(calculateDelta(a, b, c)));

        if (calculateDelta(a, b, c) > 0) {
            double x1 = -b - Math.sqrt(calculateDelta(a, b, c));
            x1 /= (2 * a);
            System.out.println(x1);
            double x2 = -b + Math.sqrt(calculateDelta(a, b, c));
            x2 /= (2 * a);
            System.out.println(x2);

        } else {
            System.out.println(calculateDelta(a, b, c) + " -> Delta is negative :(");
        }


    }

    public static double calculateDelta(int a, int b, int c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

}
