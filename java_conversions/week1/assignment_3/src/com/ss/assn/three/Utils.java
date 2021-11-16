package com.ss.assn.three;

import java.util.List;

public class Utils
{
    public static List<Integer> scalarMultiplyBy2(List<Integer> arr)
    {
        return arr.stream()
            .map(x -> x * 2)
            .toList();
    }
}
