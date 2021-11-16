package com.ss.assn.one;

import java.util.ArrayList;
import java.util.List;

public class Utils
{
    public static int sort(String a, String b)
    {
        if ((a.indexOf('e') >= 0) && !(b.indexOf('e') >= 0))
        {
            return -1;
        }
        else if (!(a.indexOf('e') >= 0) && (b.indexOf('e') >= 0))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static String intArrToString(List<Integer> arr)
    {
        if (arr.size() == 0) { return ""; } // handle empty arr

        StringBuilder res = new StringBuilder("");
        arr.forEach(x -> // for (Integer x : arr)
        {
            res.append((x % 2 == 0 ? 'e' : 'o') + x.toString() + ","); // even or odd ternary condition
        });

        return res.substring(0, res.length()-1); // removes last comma
    }

    public static List<String> parseSpecialStrFormat(List<String> arr)
    {
        List<String> res = new ArrayList<String>();
        arr.stream()
            .filter( a -> ((a.length() == 3) && (a.charAt(0) == 'a')) )
            .map(am -> am)
            .forEach(x -> res.add(x));

        return res;

    }
}
