package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.area(5, 6);
        rec.perimeter(5, 4);
        rec.isSquare(7,7);
        rec.isSquare(7,10);
        rec.replaceSides(2,8);
    }
}

class Rectangle{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA){
        super();
        this.sideA = sideA;
        this.sideB = 5;
    }

    public Rectangle(){
        this.sideA = 4;
        this.sideB = 3;
    }

    public int getSideA(){
        return sideA;
    }

    public int getSideB(){
        return sideB;
    }

    public void area(int sideA, int sideB){
        System.out.println(sideA * sideB);
    }

    public void perimeter(int sideA, int sideB){
        System.out.println((sideA + sideB) * 2);
    }

    public void isSquare(int sideA, int sideB){
        if (sideA == sideB) {
            System.out.println("is square");
        } else {
            System.out.println("no square");
        }
    }
    public void replaceSides(int sideA, int sideB){
        int x = sideA;
        sideA = sideB;
        System.out.println("side A = " + sideA);
        sideB = x;
        System.out.println("side B = " + sideB);
    }

}

class ArrayRectangles{

}

        /*Develop Rectangle and ArrayRectangles with a predefined functionality.

        On a Common level it is obligatory:

        To develop Rectangle class with following content:

        2 closed real fields sideA and sideB (sides А and В of the rectangle)
        Constructor with two real parameters a and b (parameters specify rectangle sides)
        Constructor with a real parameter a (parameter specify side А of a rectangle, side B is always equal to 5)
        Constructor without parameters (side А of a rectangle equals to 4, side В - 3)
        Method getSideA, returning value of the side А
        Method getSideВ, returning value of the side В
        Method area, calculating and returning the area value
        Method perimeter, calculating and returning the perimeter value
        Method isSquare, checking whether current rectangle is shape square or not. Returns true if the shape is square and false in another case.
        Method replaceSides, swapping rectangle sides


        On an Advanced level also needed:

        Complete Level Low Assignment

        Develop class ArrayRectangles, in which declare:

        Private field rectangleArray  - array of rectangles
        Constructor creating an empty array of rectangles with length n
        Constructor that receives an arbitrary amount of objects of type Rectangle or an array of objects of type Rectangle.
        Method addRectangle that adds a rectangle of type Rectangle to the array on the nearest free place and returning true, or returning false, if there is no free space in the array
        Method numberMaxArea, that returns order number (index) of the first rectangle with the maximum area value in array (numeration starts from zero)
        Method numberMinPerimeter, that returns order number(index) of the first rectangle with the minimum perimeter value in array (numeration starts from zero)
        Method numberSquares, that returns the number of squares in the array of rectangles
*/