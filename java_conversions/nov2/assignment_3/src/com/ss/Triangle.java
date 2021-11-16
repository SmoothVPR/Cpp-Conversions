package com.ss;

public class Triangle implements Shape
{
    private double base;
    private double height;


    public Triangle(double _base, double _height)
    {
        this.base   = _base;
        this.height = _height;

        System.out.println("Triangle created.");
    }

    public double calculateArea()
    {
        return this.base * this.height / 2;
    }

    public void display()
    {
        System.out.println("Triangle -> base: " + this.base + ", height: " + this.height + ", area: " + calculateArea() + "\n");
    }
}
