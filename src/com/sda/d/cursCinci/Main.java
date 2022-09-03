package com.sda.d.cursCinci;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle rectangle1 = new Rectangle(2, 6);
        Rectangle rectangle2 = new Rectangle(7, 3);
        Rectangle rectangle3 = new Rectangle(4, 6);

        Rectangle[] rectangles = new Rectangle[]{rectangle, rectangle1, rectangle2, rectangle3};

        int perimeterSum = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int rectanglePerimeter = rectangles[i].calculatePerimeter();
            perimeterSum += rectanglePerimeter;
        }
        System.out.println("Perimeter sum: " + perimeterSum);


        int sumArea = 0;

        for (int i = 0; i < rectangles.length; i++) {
            int area = rectangles[i].calculateArea();
            sumArea += area;
        }
        System.out.println(sumArea);
        double medianArea = (double)sumArea / rectangles.length;
        System.out.println("Median Area: " + medianArea);


    }
}