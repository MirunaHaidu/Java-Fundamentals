package com.sda.b.cursTrei.Scanner;
import java.util.Scanner;
public class OtherScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int myInt = scanner.nextInt();
//        boolean myBoolean = scanner.nextBoolean();
//        double myDouble = scanner.nextDouble();
//
//        System.out.println("Insert int: "+myInt);
//        System.out.println("Insert boolean: "+myBoolean);
//        System.out.println("Insert double: "+myDouble);


        //printf

        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0); //acel f de la % e pentru printare, ca sa arate mai bine
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3);
        System.out.println();
        System.out.printf("100 / 3 = %4d", 1000); // acel d e ca sa alinieze nr. la print
        System.out.println();
        System.out.printf("100 / 3 = %d", 100 / 3);




    }
}
