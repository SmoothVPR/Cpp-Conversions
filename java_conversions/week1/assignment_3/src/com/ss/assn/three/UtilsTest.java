package com.ss.assn.three;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void scalarMultiplyBy2_case_one()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(1);
             add(22);
             add(93);
             add(16);
             add(80);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(2);
             add(44);
             add(186);
             add(32);
             add(160);
        }};

        assertTrue(target.equals(Utils.scalarMultiplyBy2(arr)));
    }

    @Test
    public void scalarMultiplyBy2_case_two()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(0);
             add(300);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(0);
             add(600);
        }};

        assertTrue(target.equals(Utils.scalarMultiplyBy2(arr)));
    }

    @Test
    public void scalarMultiplyBy2_case_three()
    {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> target = new ArrayList<Integer>();

        assertTrue(target.equals(Utils.scalarMultiplyBy2(arr)));
    }

    @Test
    public void scalarMultiplyBy2_case_four()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(111);
             add(222);
             add(333);
             add(444);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(222);
             add(444);
             add(666);
             add(888);
        }};

        assertTrue(target.equals(Utils.scalarMultiplyBy2(arr)));
    }

    @Test
    public void scalarMultiplyBy2_case_five()
    {
        List<Integer> arr = new ArrayList<Integer>()
        {{
             add(312);
             add(8192);
             add(18411);
             add(14123);
             add(12);
             add(9156);
             add(2);
        }};

        List<Integer> target = new ArrayList<Integer>()
        {{
             add(624);
             add(16384);
             add(36822);
             add(28246);
             add(24);
             add(18312);
             add(4);
        }};

        assertTrue(target.equals(Utils.scalarMultiplyBy2(arr)));
    }
}
