package com.sda.tema.homeworkCoding.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task15map {
    public static void main(String[] args) {

    }
    public static void alternativeSolution (int[] scannedValues){
        Map<Integer, Integer> countsMap = new HashMap<>();
        for (int i = 0; i < scannedValues.length; i++){
            if (countsMap.containsKey(scannedValues[i])){
                scannedValues[i] = scannedValues[i]+1;
            } else {
                countsMap.put(i, 1);
            }
        }
        for (Map.Entry <Integer, Integer> entry: countsMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
