package com.sda.d.cursCinci;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    // metoda pentru calcularea perimetrului

    public int calculatePerimeter(){
        return 2 * length + 2 * width;
    }
    //calculate area

    public int calculateArea(){
        return length * width;
    }

}
