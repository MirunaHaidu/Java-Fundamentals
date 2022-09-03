package com.sda.c.cursPatru;

public class Main {
    //avem diferite masini si vrem sa facem comparatii
    public static void main(String[] args) {

        //le putem retine pe fiecare si intr-un Array
        //String[] carBrands = {"Audi", "BMW", "BMW"}; etc

//        String car1Brand = "Audi";
//        String car1Type = "A5";
//        int car1MaxKmPerHour = 350;
//        String car1Color = "gray";
//        int car1Weight = 2500;
//
//        String car2Brand = "BMW";
//        String car2Type = "X1";
//        int car2MaxKmPerHour = 300;
//        String car2Color = "black";
//        int car2Weight = 3000;
//
//        String car3Brand = "BMW";
//        String car3Type = "X6";
//        int car3MaxKmPerHour = 320;
//        String car3Color = "black";
//        int car3Weight = 3700;
//        printBMWcars(car1Brand, car1Type);
//        printBMWcars(car2Brand, car2Type);
//        printBMWcars(car3Brand, car3Type);




        Car car1 = new Car();
        car1.brand = "Audi";
        car1.type = "A5";
        car1.maxKmPerHour = 350;
        car1.color = "gray";
        car1.weightInKg = 2500;
        car1.motor.fuelType = "gasoline";
        car1.motor.capacity = 100;
        boolean isYellow = car1.doesColorMatch("yellow");
        System.out.println("isYellor: "+isYellow);
        System.out.println("isGray: "+car1.doesColorMatch("gray"));
        System.out.println("isOver 3500 "+car1.isOverSpecifiedWeight(3500));


        Car car2 = new Car();
        car2.brand = "BMW";
        car2.type = "X1";
        car2.maxKmPerHour = 300;
        car2.color = "black";
        car2.weightInKg = 3000;
        car2.motor.fuelType = "gasoline";
        car2.motor.capacity = 100;

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.type = "X6";
        car3.maxKmPerHour = 320;
        car3.color = "black";
        car3.weightInKg = 3700;
        car3.motor.fuelType = "diesel";
        car3.motor.capacity = 100;


        //vreau sa printez toate masinile BMW
//        printBMWcars(car1.brand, car1.type);
//        printBMWcars(car2.brand, car2.type);
//        printBMWcars(car3.brand, car3.type);

        System.out.println("--------------------");

        Car[] cars = new Car[]{car1, car2, car3};
        for (int i = 0; i < cars.length; i++) {
            printBMWcars(cars[i]);
        }

        System.out.println("--------------------");
        //vreau sa printez toate masinile negre
        for (int i = 0; i < cars.length; i++) {
            printBlackCars(cars[i]);
        }
        System.out.println("--------------------");

        //vreau sa printez toate masinile cu o viteza maxima mai mare decat 320
        for (int i = 0; i < cars.length; i++) {
            printCarsOver300Speed(cars[i]);
        }
        System.out.println("--------------------");

        //vreau sa printez toate masinile cu o greutate mai mica de 3500
        for (int i = 0; i < cars.length; i++) {
            printCarWeightlessThan3500(cars[i]);
        }
        System.out.println("--------------------");

        //verifica daca motorul e pe benzina
        for (int i = 0; i < cars.length; i++) {
            System.out.println("car "+cars[i].type + " is gasoline? " +isGasoline(cars[i]));
        }
        System.out.println("--------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("car "+cars[i].type + " is gasoline? " +isGasoline(cars[i]));
        }
        System.out.println("--------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("car "+cars[i].type + " is gasoline? " + cars[i].isGasoline());
        }

        System.out.println("--------------------");

        Car heavierCar = Car.getHeavierCar(car1, car2);
        System.out.println("Heavier car: "+heavierCar.brand + " - "+heavierCar.type);






    }

    //    //metoda pentru prima varianta
//    public static void printBMWcars (String carBrand, String type){
//        if(carBrand.equals("MBW")){
//            System.out.println("The " + type +" car is "+carBrand);
//        }
//    }
    public static void printBMWcars(Car car) {
        if (car.brand.equals("BMW")) {
            System.out.println("The " + car.type + " car is " + car.brand);
        }
    }
//      Color, with static method
    public static void printBlackCars(Car car) {
        if (car.color.equals("black")) {
            System.out.println("The " + car.type + " is " + car.color);
        }
    }





    public static void printCarsOver300Speed (Car car){
        if (car.maxKmPerHour > 300){
            System.out.println("The "+car.type+" has "+car.maxKmPerHour);
        }
    }
    public static void printCarWeightlessThan3500 (Car car){
        if (car.weightInKg < 3500){
            System.out.println("The "+ car.type+ " has " + car.weightInKg);
        }

    }

    public static boolean isGasoline(Car car){
        return (car.motor.fuelType.equals("gasoline"));

//        if (car.motor.fuelType.equals("gasoline")){
//            return true;
//        }else{
//            return false;
//        }
    }

}
