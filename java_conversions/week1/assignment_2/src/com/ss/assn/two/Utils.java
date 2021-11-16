package com.ss.assn.two;

import java.util.ArrayList;
import java.util.List;

public class Utils
{
    public static List<Integer> getRightMostDigits(List<Integer> arr)
    {
        return arr.stream()
            .map(x -> x % 10)
            .toList();
    }
}
