package com.sda.c.cursPatru;

public class Recapitulare {
    public static void main(String[] args) {

        //bubble sort

        int[] numbers = {33, 10, 11, 22, 101, 31};

        for (int i = 0; i< numbers.length; i++){
            for (int j = 0; j< numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i =0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }



    }
}
