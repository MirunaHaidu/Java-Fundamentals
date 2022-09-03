package com.sda.b.cursTrei.Scanner;

public class VarargsSecond {
    public static void main(String[] args) {

        //print all numbers passed

        printNo(); //nu i-am pasat nimic -> nu intra deloc in for = nu printeaza nimic


    }

    public static void printNo(String... strings){
        for(String s: strings){
            System.out.println(s);
        }
    }
}
