package com.sda.tema;

public class TestTema {
    public static void main(String[] args) {


/*
        String[] arrString = {"The", "only", "way", "to", "learn", "a", "new", "programming language", "is",
                "by writing programs in it"};


        int totalNoOfChars = 0;
        int totalNoOfSpaces = 0;

        for (int i =0; i < arrString.length; i++){
            String value = arrString[i];

            for (int j = 0; j <value.length(); j++){
                if (value.charAt(j) == ' '){
                    totalNoOfSpaces++;
                }
            }
            totalNoOfChars += arrString[i].length();
        }
        System.out.println("Total of chars: "+totalNoOfChars);
        System.out.println("Total of spaces: "+totalNoOfSpaces);
        System.out.println("Total of chars without spaces: "+(totalNoOfChars-totalNoOfSpaces));*/



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
                int valueAtPosition = matrix[i][j];

               /* prima varianta
                if(i == j){ // diagonala principala

                    if (valueAtPosition % 2 == 0){
                        mainDiagonal += valueAtPosition;
                    }
                }*/

                if (i == j && valueAtPosition % 2 ==0){
                    mainDiagonal += valueAtPosition;
                }


                if(i+j == matrix.length -1){ // diagonala secundara
                    boolean isPrime = true;
                    for(int k=2; k<valueAtPosition; k++){
                        if(valueAtPosition % k == 0){
                            isPrime = false;
                        }
                    }

                    if(isPrime == true){
                        secondDiagonal += valueAtPosition;
                    }


                }

            }
        }
        System.out.println("Sum of main diagonal is: "+mainDiagonal);
        System.out.println("Sum of secondary diagonal is: "+secondDiagonal);






        /* This is how you determine a prime nr.
        int no = 9;
        boolean isPrime = true;
        for ( int i = 2; i<no/2; i++){
            if (no%i == 0){
                isPrime = false;
            }
        }
        System.out.println("isPrime: "+isPrime);*/


    }
}