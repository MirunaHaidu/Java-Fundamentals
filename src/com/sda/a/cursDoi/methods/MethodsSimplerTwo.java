package com.sda.a.cursDoi.methods;

public class MethodsSimplerTwo {
    public static void main(String[] args) {

        int[] intArr = new int[]{2,4,8,10,100,99,56};
        //vrem sa printam suma pana la primul nr impar
        int sum = sumUnitilFirstOddNo(intArr);
        System.out.println(sum);


        printSum(11, 1600);


    }

    public static int sumUnitilFirstOddNo(int[] arr){

        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            } else{
                break;
            }
        }
        return sum;
    }

    public static boolean case1(int a){
        return a % 2 ==0;
    }

    public static boolean case2(int a){
        if(a > 10){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean case3(int a){
        if(a > 10){
            return true;
        }
        if (a<8){
            return false;
        }

        return false; //asta e default, pt ca altfel ramane 9 si compilator nu stie ce sa faca
    }

    public static int sumOfArrElements(int[] arrEl){
        if (arrEl.length == 0){ //o validare, ca sa nu mai execute tot pt. verificare
            return 0;
        }

        int sum = 0;
        for (int i=0; i<arrEl.length; i++){
            sum += arrEl[i];
        }
        return sum;
    }

    public static void printSum(int a, int b){
        if (a>10){
            return; // la metoda void avem return fara valoare, doar ca sa nu se mai execute restul conditiei
        }


        int sum = a+b;
        System.out.println("sum: "+sum);
        if (sum>1000){
            return;
        }
        System.out.println(b);
    }


}
