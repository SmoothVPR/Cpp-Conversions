package com.ss;

import static java.lang.Math.PI;

public class Circle implements Shape
{
    private double radius;

    public Circle(double _radius)
    {
        this.radius = _radius;

        System.out.println("Circle created.");
    }

    public double calculateArea()
    {
        return PI * radius * radius;
    }

    public void display()
    {
        System.out.println("Circle -> radius: " + this.radius + ", area: " + calculateArea() + "\n");
    }
}
