package com.sda.tema.homeworkCoding.a;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Choose one number: ");
        float firstNumber = scanner.nextFloat();

        System.out.println("What operation do you want? Choose between + - / *: ");
        String symbol = scanner.next();
        if (!(correctOperation(symbol))){
            System.out.println("Invalid symbol");
        }

        System.out.println("Choose the second number: ");
        float secondNumber = scanner.nextFloat();



        if (symbol.equals("+")){
            System.out.print("Sum is: "+sum(firstNumber, secondNumber));
        } else if (symbol.equals("-")){
            System.out.print("Difference is: "+subtract(firstNumber, secondNumber));
        } else if (symbol.equals("/")){
            System.out.print("Division: "+ divide(firstNumber, secondNumber));
        } else if (symbol.equals("*")){
            System.out.print("The product is: "+multiply(firstNumber, secondNumber));
        } else{
            System.out.println("Cannot calculate :(");
        }





    }
    public static boolean correctOperation(String symbol) {
        if (symbol.equals("+") || symbol.equals("-") ||
                symbol.equals("/") || symbol.equals("*")){
            return true;
        }
        return false;
    }

    public static float sum (float a, float b){
        return a + b;
    }
    public static float subtract (float a, float b){
        return a - b;
    }
    public static float divide (float a, float b){
        return a / b;
    }
    public static float multiply (float a, float b){
        return a * b;
    }

}
