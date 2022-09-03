package com.sda.e.cursSase;

public class LocalVariable {
    public static void main(String[] args) {

        System.out.println(wrapperVariable);
        for (int i = 0; i <10; i = i+2){
            wrapperVariable = Integer.parseInt(i + "");
            System.out.println(wrapperVariable);
        }


    }
    private static Integer wrapperVariable;
}
