package com.sda.a.cursDoi.methods;

public class MethodsSimpler {
    public static void main(String[] args) {
        //sum of two numbers

        int no1 = 10;
        int no2 = 11;
//        int sum = no1 + no2;
//        System.out.println("sum1: "+sum);
        printSum(no1, no2);

        printDiff(no1, no2);
        printDiff(no2, no1);


        int no3 = 15;
        int no4 = 11;
//        int sum2 = no3 + no4;
//        System.out.println("sum2: "+sum2);
        printSum(no3, no4);
        printDiff(no3, no4);

        int no5 = 22;
        int no6 = 33;
//        int sum3 = no5 + no6;
//        System.out.println("sum3: "+sum3);
        printSum(no5, no6);
        printDiff(no5, no6);


        System.out.println("------------------------------------");
        printFirstTenNumbers();
        System.out.println("------------------------------------");
        //10
        printFirstNNumbers(10);
        //15
        printFirstNNumbers(15);

        System.out.println("------------------------------------");
        //produsul a 3 numere, oricare
        printProd(1, 5, 11);

        System.out.println("------------------------------------");
        //float f1 = 30.0f;

        printSum(10.5f, 11.4f); //trebuie sa facem alta metoda (o putem denumi la fel, dar cu float)
        System.out.println("------------------------------------");

        //methods returning values
        int a =100;
        int b=70;
        int sum = sum(a, b);
        if (isEven(sum)){
            System.out.println("suma este para");
        }else{
            System.out.println("suma este impara");
        }



    }



    public static void printSum(int firstValue, int secondValue){
        int sum = firstValue + secondValue;
        System.out.println("sum: "+sum);
    }
    public static void printSum(float firstValue, float secondValue){
        float sum = firstValue + secondValue;
        System.out.println("sum: "+sum);
    }
    public static void printDiff(int firstValue, int secondValue){
        int diff = firstValue - secondValue;
        System.out.println("diff: "+diff);
    }
    public static void printFirstTenNumbers(){ //in metoda asta nu am definit nimic
        System.out.println("First 10 numbers.");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    public static void printFirstNNumbers(int n){
        System.out.println("First "+n+" numbers are:");
        for (int i =0; i<n; i++){
            System.out.println(i);
        }
    }
    public static void printProd(int a, int b, int c){
        int prod = a * b * c;
        System.out.println("prod: "+prod);
    }
    //metoda cu return:

    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static boolean isEven(int number){
        return number % 2 == 0; //this is simpler
        /* acelasi lucru:
        if(number %2 ==0){
            return true;
        }else{
            return false;
        }*/
    }





}
