package com.ss.assn.two;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void getRightMostDigits_case_one()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(1);
             add(22);
             add(93);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(1);
             add(2);
             add(3);
        }};

        assertTrue(Utils.getRightMostDigits(arr).equals(target));
    }

    @Test
    public void getRightMostDigits_case_two()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(123);
             add(222);
             add(321);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(3);
             add(2);
             add(1);
        }};

        assertTrue(Utils.getRightMostDigits(arr).equals(target));
    }

    @Test
    public void getRightMostDigits_case_three()
    {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> target = new ArrayList<Integer>();

        assertTrue(Utils.getRightMostDigits(arr).equals(target));
    }
    
    @Test
    public void getRightMostDigits_case_four()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(13);
             add(2224);
             add(32);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(3);
             add(4);
             add(2);
        }};

        assertTrue(Utils.getRightMostDigits(arr).equals(target));
    }

    @Test
    public void getRightMostDigits_case_five()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(0);
             add(22);
             add(31316);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(0);
             add(2);
             add(6);
        }};

        assertTrue(Utils.getRightMostDigits(arr).equals(target));
    }
}
