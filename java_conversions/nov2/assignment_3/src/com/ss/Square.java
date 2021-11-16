package com.ss;

public class Square implements Shape
{
    private double width;

    public Square(double _width)
    {
        this.width = _width;

        System.out.println("Square created.");
    }

    public double calculateArea()
    {
        return this.width * this.width;
    }

    public void display()
    {
        System.out.println("Square -> width: " + this.width + ", area: " + calculateArea() + "\n");
    }
}
