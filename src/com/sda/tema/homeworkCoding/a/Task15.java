package com.sda.tema.homeworkCoding.a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type 10 numbers");

        int[] arrInt = new int[10];
        for (int i = 0; i<arrInt.length; i++) {
            arrInt[i] = scanner.nextInt();
        }
        System.out.print("Repeated numbers are: ");
        repeatedNumbers(arrInt);
        System.out.println();
        System.out.println("-----------------------------");
        alternativeSolution(arrInt);

    }
    public static void repeatedNumbers (int[] arr){
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void alternativeSolution (int[] scannedValues){
        Map<Integer, Integer> countsMap = new HashMap<>();
        int count;
        int readNumber;

        for (int i = 0; i < scannedValues.length; i++){
            readNumber = scannedValues[i];
            if (countsMap.containsKey(readNumber)){
               //obtin nr de citiri si il incrementez cu 1
                count = countsMap.get(readNumber)+1;
               // actualizez valoarea din map
                countsMap.put(readNumber, count);
            } else {
                //initializez in map cu 1 prima data cand am intalnit un numar nou (key noua)
                countsMap.put(readNumber, 1);
            }
        }
        for (Map.Entry <Integer, Integer> entry: countsMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
