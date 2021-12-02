package com.ss.assn.four;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.Math.sqrt;
import org.junit.Test;

public class LineTest
{
    Line line1 = new Line(1, 1, 2, 2); // Slope of  1
    Line line2 = new Line(1, 2, 2, 3); // Slope of  1
    Line line3 = new Line(2, 1, 2, 1); // Not a real line
    Line line4 = new Line(1, 2, 2, 1); // Slope of -1
    Line line5 = new Line(2, 2, 4, 2); // Slope of  0
    
    @Test
    public void parallelToSameLeftToRight()
    {
        // Same slope
        assertTrue(line5.parallelTo(line5));
        assertTrue(line4.parallelTo(line4));
        assertTrue(line2.parallelTo(line2));
        assertTrue(line2.parallelTo(line1));
        assertTrue(line1.parallelTo(line2));
        assertTrue(line1.parallelTo(line1));
    }

    @Test
    public void parallelToSameRightToLeft()
    {
        // Same slope
        assertTrue(line5.parallelTo(line5));
        assertTrue(line4.parallelTo(line4));
        assertTrue(line2.parallelTo(line2));
        assertTrue(line2.parallelTo(line1));
        assertTrue(line1.parallelTo(line2));
        assertTrue(line1.parallelTo(line1));
    }

    @Test
    public void parallelToDiffLeftToRight()
    {
        // Different slope
        assertFalse(line5.parallelTo(line4));
        assertFalse(line5.parallelTo(line2));
        assertFalse(line5.parallelTo(line1));
        assertFalse(line4.parallelTo(line2));
        assertFalse(line4.parallelTo(line1));
    }

    @Test
    public void parallelToDiffRightToLeft()
    {
        // Different slope (swapped order)
        assertFalse(line4.parallelTo(line5));
        assertFalse(line2.parallelTo(line5));
        assertFalse(line1.parallelTo(line5));
        assertFalse(line2.parallelTo(line4));
        assertFalse(line1.parallelTo(line4));
    }

    @Test(expected = ArithmeticException.class)
    public void parallelToInvalid()
    {
        
        // Line 3 isn't a proper line
        assertFalse(line2.parallelTo(line3));
        assertFalse(line3.parallelTo(line2));
        assertFalse(line3.parallelTo(line1));
        assertFalse(line1.parallelTo(line3));
       
    }
    
    @Test
    public void getSlopeAccuracy()
    {
        // Is accurate slope
        assertTrue(line1.getSlope() - 1 < 0.0001);
        assertTrue(line2.getSlope() - 1 < 0.0001);
        assertTrue(line5.getSlope() + 0 < 0.0001); // for consistency
    }

    @Test
    public void getSlopePositive()
    {
        // Is positive slope
        assertTrue(line1.getSlope() > 0);
        assertTrue(line2.getSlope() > 0);
    }

    @Test
    public void getSlopeNegative()
    {
        // Is negative slope
        assertTrue(line4.getSlope() < 0);
    }
    
    @Test
    public void getDistanceAccuracy()
    {
        // Is accurate calc
        assertTrue(line1.getDistance() - sqrt(2) < 0.0001);
        assertTrue(line2.getDistance() - sqrt(2) < 0.0001);
        assertTrue(line4.getDistance() - sqrt(2) < 0.0001);
        assertTrue(line5.getDistance() - sqrt(4) < 0.0001);
    }

    @Test
    public void getDistancePositive()
    {
        // Is positive
        assertTrue(line1.getDistance() > 0);
        assertTrue(line2.getDistance() > 0);
        assertTrue(line4.getDistance() > 0);
        assertTrue(line5.getDistance() > 0);
    }

    @Test
    public void getDistanceNotNegative()
    {
        // Is not negative
        assertFalse(line1.getDistance() < 0);
        assertFalse(line2.getDistance() < 0);
        assertFalse(line4.getDistance() < 0);
        assertFalse(line5.getDistance() < 0);
    }
}
