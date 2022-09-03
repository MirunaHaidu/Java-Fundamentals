package com.sda.b.cursTrei.Scanner;

public class Exercitii {
    public static void main(String[] args) {

        //se da un string. Operatii:
        // printeaza nr. de cuvinte
//        String string = "Ana are mere";
//        String[] arrString = string.split(" ");
//        System.out.println("Stringul are: "+arrString.length);

        //cuvant 1 = toate literele mari; cuvant 2 = toate mici; cuvant 3 = litere mari etc;

        String s2 = "Programarea este ceva ce ne dorim sa invatam";
        String[] stringSplit = s2.split(" "); //am spart in cuvinte

        for(int i = 0; i< stringSplit.length; i++){
            if(i % 2 == 0){
                String s2Upper = stringSplit[i].toUpperCase();
                stringSplit[i] = s2Upper;
            } else{
                String s2Lower = stringSplit[i].toLowerCase();
                stringSplit[i] = s2Lower;
            }
//            System.out.print(stringSplit[i]+" ");
        }

        for (int i=0; i < stringSplit.length; i++){
            System.out.print(stringSplit[i]);
            if (isNotLastIndex(i, stringSplit.length-1)){
                System.out.print(" ");
            }


        }
        System.out.println(".");




    }
    public static boolean isNotLastIndex (int index, int lastIndex){
        return  index <  lastIndex;
    }

}
