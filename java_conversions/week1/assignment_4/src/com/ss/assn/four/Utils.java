package com.ss.assn.four;

import java.util.List;

public class Utils
{
    public static List<String> removeAllX(List<String> arr)
    {
        return arr.stream()
            .map(x -> x.replaceAll("x", ""))
            .toList();
    }
}
