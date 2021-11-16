package com.ss;

public class Main
{
    public static void main(String[] args)
    {
        Square square = new Square(5);
        square.display();

        Circle circle = new Circle(5);
        circle.display();

        Triangle triangle = new Triangle(5, 5);
        triangle.display();
    }
}
