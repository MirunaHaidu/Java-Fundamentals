package com.sda.d.cursCinci;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    //calculam perimetrul
    public int calculatePerimeter() {
        return 4 * this.side;
    }

    //calculam aria
    public int calculateAria() {
        return side * side;
//        return Math.pow(side, 2);
    }

}
