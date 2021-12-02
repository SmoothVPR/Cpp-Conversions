package com.ss.assn.four;

/**
 * Author:   Malik R Booker
 * Created:  November 3, 2021
 * Modified: November 5, 2021
 *
 * Brief:
 *   Creates two line classes and compares the slopes as well as calculates
 *   the distance between the two lines.
**/

public class Main
{
    public static void main(String[] args)
    {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 2, 2, 3);

        try
        {
            System.out.println("Line 1 slope: " + line1.getSlope());
            System.out.println("Line 2 slope: " + line2.getSlope());
        }
        catch (ArithmeticException e)
        {
            // Not a real line
        }

        System.out.println("\nLine 1 is" + (line1.parallelTo(line2) ? " " : " not ") + "parallel to Line 2\n");

        System.out.println("Line 1 distance: " + line1.getDistance());
        System.out.println("Line 2 distance: " + line2.getDistance());
    }
}
