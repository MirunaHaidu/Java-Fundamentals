package com.sda.tema.homeworkCoding.a;


public class Task2 {
    public static void main(String[] args) {

        float weight = 47;
        int height = 159; //trebuie float pentru formula asta
        System.out.println(calculateBMI(weight,height));
        if (calculateBMI(weight, height) < 18.5) {
            System.out.println("BMI not optimal, too low.");
        } else if (calculateBMI(weight, height) > 24.9) {
            System.out.println("BMI not optimal, too high.");
        } else{
            System.out.println("BMI optimal. You're good :)");
        }


    }

    public static double calculateBMI(float weight, float height) {
        return weight / Math.pow(height, 2);
    }
    public static double calculateBMI(float weight, int height) {
        return ((weight / height) / height) * 10_000;
    }

}
