package com.ss.assn.one;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void sortTestOne()
    {
        ArrayList<String> original = new ArrayList<String>();
        ArrayList<String> target   = new ArrayList<String>();

        original.add("i");
        original.add("see");
        original.add("trees");
        original.add("of");
        original.add("green");
        original.add("red");
        original.add("roses");
        original.add("too");
        original.add("i");
        original.add("see");
        original.add("them");
        original.add("bloom");
        original.add("for");
        original.add("me");
        original.add("and");
        original.add("you");

        target.add("see");
        target.add("trees");
        target.add("green");
        target.add("red");
        target.add("roses");
        target.add("see");
        target.add("them");
        target.add("me");
        target.add("i");
        target.add("of");
        target.add("too");
        target.add("i");
        target.add("bloom");
        target.add("for");
        target.add("and");
        target.add("you");

        original.sort((a, b) -> Utils.sort(a, b));

        for (int i = 0; i < original.size(); i++)
        {
            assertTrue(original.get(i).compareTo(target.get(i)) == 0);
        }
    }

    @Test
    public void sortTestTwo()
    {
        ArrayList<String> original = new ArrayList<String>();
        ArrayList<String> target   = new ArrayList<String>();

        original.add("a");
        original.add("trivially");
        original.add("sized");
        original.add("array");
        original.add("of");
        original.add("acceptable");
        original.add("strings");

        target.add("sized");
        target.add("acceptable");
        target.add("a");
        target.add("trivially");
        target.add("array");
        target.add("of");
        target.add("strings");

        original.sort((a, b) -> Utils.sort(a, b));

        for (int i = 0; i < original.size(); i++)
        {
            assertTrue(original.get(i).compareTo(target.get(i)) == 0);
        }
    }

    @Test
    public void sortTestEmpty()
    {
        ArrayList<String> original = new ArrayList<String>();
        ArrayList<String> target   = new ArrayList<String>();

        original.sort((a, b) -> Utils.sort(a, b));
        
        for (int i = 0; i < original.size(); i++)
        {
            assertTrue(original.get(i).compareTo(target.get(i)) == 0);
        }
    }

    @Test
    public void sortTestNoEsPresent()
    {
        ArrayList<String> original = new ArrayList<String>();
        ArrayList<String> target   = new ArrayList<String>();
        
        original.add("how");
        original.add("hard");
        original.add("is");
        original.add("it");
        original.add("actually");
        original.add("to");
        original.add("form");
        original.add("this?");

        target.add("how");
        target.add("hard");
        target.add("is");
        target.add("it");
        target.add("actually");
        target.add("to");
        target.add("form");
        target.add("this?");


        original.sort((a, b) -> Utils.sort(a, b));

        for (int i = 0; i < original.size(); i++)
        {
            assertTrue(original.get(i).compareTo(target.get(i)) == 0);
        }
    }

    @Test
    public void intArrToStringStandard()
    {
        List<Integer> arr = new ArrayList<Integer>(); // { 0, 1, 2, 3, 4, 5, 0, 4, 3, 2, 1};
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(0);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        assertEquals("e0,o1,e2,o3,e4,o5,e0,e4,o3,e2,o1", Utils.intArrToString(arr));
    }

    @Test
    public void intArrToStringIncludingZero()
    {
        List<Integer> arr = new ArrayList<Integer>(); //{ 1, 2, 3, 4, 5, 4, 3, 2, 1};
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        assertEquals("o1,e2,o3,e4,o5,e4,o3,e2,o1", Utils.intArrToString(arr));
    }

    @Test
    public void intArrToStringEmptyArr()
    {
        List<Integer> arr = new ArrayList<Integer>();

        assertEquals(0, Utils.intArrToString(arr).length());
    }

    @Test
    public void parseSpecialStrFormatStandard()
    {
        List<String> strings = new ArrayList<String>(); // { "how", "many", "men", "and", "women", "are", "there" };
        strings.add("how");
        strings.add("many");
        strings.add("men");
        strings.add("and");
        strings.add("women");
        strings.add("are");
        strings.add("there");

        List<String> target = new ArrayList<String>(); // { "and", "are" };
        target.add("and");
        target.add("are");

        for (int i = 0; i < target.size(); i++)
        {
            assertTrue(Utils.parseSpecialStrFormat(strings).get(i).compareTo(target.get(i)) == 0);
        }
    }

    @Test
    public void parseSpecialStrFormatOutputSize()
    {
        List<String> strings = new ArrayList<String>(); // { "how", "many", "men", "and", "women", "are", "there" };
        strings.add("how");
        strings.add("many");
        strings.add("men");
        strings.add("and");
        strings.add("women");
        strings.add("are");
        strings.add("there");

        assertEquals(2, Utils.parseSpecialStrFormat(strings).size()); // { "and", "are" };
    }

    public void parseSpecialStrFormatNo3LetterA()
    {
        List<String> strings = new ArrayList<String>(); // { "how", "pop", "men", "top" };
        strings.add("how");
        strings.add("pop");
        strings.add("men");
        strings.add("top");

        assertEquals(0, Utils.parseSpecialStrFormat(strings).size());
    }

    public void parseSpecialStrFormat3LetterWithoutA()
    {
        List<String> strings = new ArrayList<String>(); // { "how", "many", "men", "women", "there" };
        strings.add("how");
        strings.add("many");
        strings.add("men");
        strings.add("women");
        strings.add("there");

        List<String> res = new ArrayList<String>();
        assertEquals(strings.size(), res.size());
    }
}
