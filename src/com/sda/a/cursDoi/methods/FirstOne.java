package com.sda.a.cursDoi.methods;

public class FirstOne {
    public static void main(String[] args) {

        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        calculateAndPrintSumOfEvenNumbers(intArr);
//        int sum = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            if (intArr[i] % 2 == 0) {
//                sum += intArr[i];
//            }
//
//        }
//        System.out.println("Sum is: " + sum);


        int[] intArr2 = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18};
        calculateAndPrintSumOfEvenNumbers(intArr2);
//        int sum2 = 0;
//        for (int i = 0; i < intArr2.length; i++) {
//            if (intArr2[i] % 2 == 0) {
//                sum2 += intArr2[i];
//            }
//        }
//        System.out.println("sum is: " + sum2);

        int[] intArr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        calculateAndPrintSumOfEvenNumbers(intArr3);
        System.out.println("test");

        float[] floatArr = new float[]{1.0f, 2.0f, 2.5f};
        floatSum(floatArr);
    }

    public static void calculateAndPrintSumOfEvenNumbers(int[] intArr) {

        //int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                sum += intArr[i];
            }

        }
        System.out.println("Sum is: " + sum);
    }
    public static void floatSum(float[]intArr){
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                sum += intArr[i];
            }

        }
        System.out.println("Sum is: " + sum);
    }
}
