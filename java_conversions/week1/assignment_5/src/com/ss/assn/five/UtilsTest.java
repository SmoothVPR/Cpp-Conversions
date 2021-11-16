package com.ss.assn.five;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void groupClumpSum_case_one()
    {
        int start = 0;
        List<Integer> arr = new ArrayList<Integer>()
        {{
            add(2);
            add(4);
            add(8);
        }};
        int target = 10;

        assertTrue(Utils.groupClumpSum(start, arr, target));
    }

    @Test
    public void groupClumpSum_case_two()
    {
        int start = 0;
        List<Integer> arr = new ArrayList<Integer>()
        {{
            add(1);
            add(2);
            add(4);
            add(8);
            add(1);
        }};
        int target = 14;

        assertTrue(Utils.groupClumpSum(start, arr, target));
    }

    @Test
    public void groupClumpSum_case_three()
    {
        int start = 0;
        List<Integer> arr = new ArrayList<Integer>()
        {{
            add(2);
            add(4);
            add(4);
            add(8);
        }};
        int target = 14;

        assertFalse(Utils.groupClumpSum(start, arr, target));
    }

    @Test
    public void groupClumpSum_case_four()
    {
        int start = 0;
        List<Integer> arr = new ArrayList<Integer>();
        int target = 0;

        assertTrue(Utils.groupClumpSum(start, arr, target));
    }

    @Test
    public void groupClumpSum_case_five()
    {
        int start = 0;
        List<Integer> arr = new ArrayList<Integer>()
        {{
            add(2);
            add(2);
            add(2);
            add(4);
            add(8);
        }};
        int target = 10;

        assertTrue(Utils.groupClumpSum(start, arr, target));
    }
}
