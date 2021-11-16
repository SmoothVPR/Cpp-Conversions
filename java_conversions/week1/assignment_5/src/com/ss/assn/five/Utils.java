package com.ss.assn.five;

import java.util.List;

public class Utils
{
    public static boolean groupClumpSum(int start, List<Integer> arr, int target)
    {
        if (start >= arr.size() && target == 0)
        {
            return true;
        }
        else if (start >= arr.size())
        {
            return false;
        }
          
        int sum = 0;
        int i = start;
        while (i < arr.size() && arr.get(start) == arr.get(i))
        {
            sum += arr.get(i);
            i++;
        }
                                  
        if (groupClumpSum(i, arr, target - sum))
        {
            return true;
        }
        if (groupClumpSum(i, arr, target))
        {
            return true;
        }
                                                      
        return false;
    }
}
