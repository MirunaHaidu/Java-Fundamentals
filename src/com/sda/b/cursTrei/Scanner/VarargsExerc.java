package com.sda.b.cursTrei.Scanner;

public class VarargsExerc {
    public static void main(String[] args) {

        int a = 100;
        int b = 57;
//        int sumOfValues = sum(a, b);
//        System.out.println("Suma este: "+sumOfValues);

        int c = 5;
        int d = 5;
        int e = 100;
        int f =100;

        //int sum1 = sum(sumOfValues, c);
        int[] arrSum = new int[]{a, b, c, d, e, f};
//        int total = 0;
//        for(int i =0; i< arrSum.length; i++){
//            total = sum(total, arrSum[i]);
//        }
//        System.out.println(total);

        //o metoda care primeste intreg array-ul si returneaza suma lor
        System.out.println(sumOfVarargs(a, b, c, d, e, f)); //se comporta exact ca un array

        System.out.println("------------");
        int maxNo = findMaxNo(new int[]{10, 5, 8, 2, 33, 5});
        System.out.println("Max no.: "+maxNo);




    }
    public static int sumOfVarargs(int ... varArg){
        int sum = 0;
        for(int i =0; i< varArg.length; i++) {
            sum += varArg[i];
        }
        return sum;
    }
    public static int findMaxNo(int[] intArr){

        if(intArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = intArr[0];
        for(int i=1; i<intArr.length; i++){
            if(intArr[i] > max){
                max = intArr[i];
            }
        }
        return max;
    }



    public static int sumOfArray(int[] intArray){
        int sum = 0;
        for(int i =0; i< intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;

    }




    public static int sum(int firstValue, int secondValue){
        return firstValue + secondValue;
    }
}
