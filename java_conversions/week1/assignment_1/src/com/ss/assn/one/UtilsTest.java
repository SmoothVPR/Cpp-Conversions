package com.ss.assn.one;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void PerformOperation_IsOdd()
    {
        assertEquals("ODD", Utils.PerformOperation(1, 11));
    }

    @Test
    public void PerformOperation_IsEven()
    {
        assertEquals("EVEN", Utils.PerformOperation(1, 10));
    }

    @Test
    public void PerformOperation_IsPrime()
    {
        assertEquals("PRIME", Utils.PerformOperation(2, 7));
    }

    @Test
    public void PerformOperation_IsComposite()
    {
        assertEquals("COMPOSITE", Utils.PerformOperation(2, 10));
    }

    @Test
    public void PerformOperation_IsPalindrome()
    {
        assertEquals("PALINDROME", Utils.PerformOperation(3, 112232211));
    }

    @Test
    public void PerformOperation_IsNotPalindrome()
    {
        assertEquals("NOT PALINDROME", Utils.PerformOperation(3, 112231));
    }
}
