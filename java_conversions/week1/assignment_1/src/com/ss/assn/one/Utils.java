package com.ss.assn.one;

public class Utils
{
    public static String PerformOperation(int op, int n) throws ArithmeticException
    {
        if (op < 1 || op > 3) { throw new ArithmeticException(); }

        StringBuilder res = new StringBuilder();
        switch (op)
        {
            case 1:
                res.append((isOdd(n) ? "ODD" : "EVEN"));
                break;
            case 2:
                res.append((isPrime(n) ? "PRIME" : "COMPOSITE"));
                break;
            case 3:
                res.append((isPalindrome(n) ? "PALINDROME" : "NOT PALINDROME"));
                break;
            default:
                break;
        }

        return res.toString();
    }

    private static boolean isOdd(int n)
    {
        return n % 2 != 0;
    }

    private static boolean isPrime(int n)
    {
        int i = 1;
        while (++i <= n / 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    private static boolean isPalindrome(int n)
    {
        String k = Integer.toString(n);

        int i = 0, j = k.length()-1;
        while (i < j)
        {
            if (k.charAt(i) != k.charAt(j))
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
