package com.sda.c.cursPatru;

public class Car {

    //obiect de date, are doar field-uri:
    String brand;
    String type;
    int maxKmPerHour;
    String color;
    int weightInKg;

   Motor motor = new Motor();

// color without static method
    public boolean doesColorMatch(String colorToMatch){
        return color.equals(colorToMatch);
    }

    public boolean isOverSpecifiedWeight (int weightToCompare){
        return weightInKg > weightToCompare;
    }

    public boolean isGasoline(){
        return motor.fuelType.equals("gasoline");
    }

    public static Car getHeavierCar(Car car1, Car car2){
        //ternary if - <conditie> ? <valoarea de return pe true>  : <valoarea de return pe false>
        return car1.weightInKg >-car2.weightInKg ? car1 : car2;


//        if(car1.weightInKg >= car2.weightInKg){
//            return car1;
//        } else{
//            return car2;
//        }
    }



}
