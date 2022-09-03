package com.sda.tema;

import java.util.Arrays;

public class Tema1 {
    public static void main(String[] args) {


        // 1.
         float[] arrayFloat = new float[]{10.5F, 12.1F, 14.3F, 5.21F, 6.21F, 10.9F};
   //a)
    float sum = 0F;
    for (int i=0; i< arrayFloat.length; i++){
        sum += arrayFloat[i];

    }
        System.out.println(sum);


         //b)
        /*float result = arrayFloat[0] - arrayFloat[1] + arrayFloat[2] - arrayFloat[3] + arrayFloat[4] - arrayFloat[5];
        System.out.println(result);*/

        float difference = 0;
        for (int i=0; i<arrayFloat.length; i++ ){
            if(i % 2 == 0){
                difference += arrayFloat[i];
            }else{
                difference -= arrayFloat[i];
            }
        }
        System.out.println("difference: "+difference);
         //c)

        float diff = arrayFloat[0] - arrayFloat[arrayFloat.length-1];
        System.out.println(diff);

        // d)
        float numBig = 0;
        for(int i = 0; i< arrayFloat.length; i++){
            if(arrayFloat[i] > 9){
                numBig += arrayFloat[i];
            }
        }
        System.out.println(numBig);

        // c)
        float prod = 1;
        int count = 0;
        while (count < arrayFloat.length){
            prod *= arrayFloat[count];
            count ++;
        }
        System.out.println(prod);
        System.out.println("--------------------------------------");

        // 2.
        char[] charArr = new char[]{'a', 'n', 'a', 'a', 'r', 'e', 'm', 'e', 'r', 'e'};
        int nr = 0;
        for(int i=0; i< charArr.length; i++){
            if(charArr[i]=='a'){
                nr++;

            }
        }
        System.out.println(nr);

        System.out.println("--------------------------------------");

        //3
        String[] arrString = {"The", "only", "way", "to", "learn", "a", "new", "programming language", "is",
                "by writing programs in it"};

         //a)
        for (int i=0; i< arrString.length; i++){
            System.out.print(arrString[i]);
            if(i != arrString.length-1){
                System.out.print(" ");
            }
        }
        System.out.println(".");

       // b)
      /* String a = arrString[0] + arrString[1]+ arrString[2]+ arrString[3]+ arrString[4]+
                arrString[5]+arrString[6]+ arrString[7]+ arrString[8]+arrString[9];
        System.out.println(a.length());*/

        int total = 0;
        for (int i = 0; i < arrString.length; i++){
            total +=arrString[i].length();
        }
        System.out.println(total);

        System.out.println("--------------------------------------");


        int[][] matrix = new int[5][];
        matrix[0] = new int[]{10, 11, 43, 55, 7};
        matrix[1] = new int[]{2, 5, 6, 9, 9};
        matrix[2] = new int[]{101, 22, 2, 6, 8};
        matrix[3] = new int[]{10, 21, 8, 11, 14};
        matrix[4] = new int[]{15, 11, 16, 4, 6};

        int mainDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i] == matrix[j]) {
                    if (matrix[i][j] % 2 == 0) {
                        mainDiagonal += matrix[i][j];
                    }


                }
                if((i+j) == (matrix.length)-1){
                    if (matrix[i][j] % 2 == 1){
                        secondDiagonal += matrix[i][j];
                    }
                }
            }
        }
        System.out.println("Sum of main diagonal is: "+mainDiagonal);
        System.out.println("Sum of secondary diagonal is: "+secondDiagonal);

    }


}

