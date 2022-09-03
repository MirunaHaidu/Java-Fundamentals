package com.sda;

public class Main {

    public static void main(String[] args) {

/*
        int[] intArr = new int[]{55, 100, 1000};

        System.out.println(intArr[0]);

        int[] emptyArr = new int[4];
        System.out.println(emptyArr[0]);

         */

        int[] numbersArr = new int[]{2, 5, 6, 7, 8, 11, 14, 21};
        System.out.println("numbersArr length: " + numbersArr.length);
        for (int index = 0; index < numbersArr.length; index++) {
            System.out.println("inside the for loop " + index + " - " + numbersArr[index]);
        }

        for (int counter = 0; counter < numbersArr.length; counter++) {
            if (numbersArr[counter] % 2 == 0) {
                System.out.println("Aceste numere sunt pare " + numbersArr[counter]);

            }
        }


        String[] stringArr = new String[]{"Ana", "are", "mere"};
        for (int i = 0; i < stringArr.length; i++) {
            System.out.print(stringArr[i]);
            if (i != stringArr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(".");

        System.out.println("----------------------------");


        String[] nameArray = new String[]{"Ana", "Emil", "Tavi"};
        nameArray[1] = "test";
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
        System.out.println("----------------------------");


        //multi-dimensional arrays (Matrici)

        int[][] emptyMatrix = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]" + " = " + emptyMatrix[i][j]);
            }
        }
        System.out.println("----------------------------");

        int [][] matrix = new int [3][];
        matrix[0] = new int[] {10, 7, 3, 2, 5};
        matrix[1] = new int[]{11, 23, 7, 22, 0};
        matrix [2] = new int[]{11, 77, 7, 22, 0};
        //calculate the sum of elements on the second column

        int sum = 0;

        for (int i=0; i< matrix.length; i++){
            //sum += matrix[i][1]; se poate si asa
            for(int j=0; j<matrix[i].length; j++){
                if(j == 1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("sum: "+sum);


        System.out.println("----------------------------");
        //for each / enhanced for:

        String[] names = new String[]{"Dragos", "Bogdan", "Anca"};
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        for(String name : names){
            System.out.println(name);
        }


    }


}


