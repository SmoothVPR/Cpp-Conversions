package com.ss.assn.four;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void removeAllX_case_one()
    {
        List<String> arr = new ArrayList<String>()
        {{
             add("ax");
             add("bb");
             add("cx");
        }};

        List<String> target = new ArrayList<String>()
        {{
             add("a");
             add("bb");
             add("c");
        }};

        assertTrue(target.equals(Utils.removeAllX(arr)));
    }

    @Test
    public void removeAllX_case_two()
    {
        List<String> arr = new ArrayList<String>()
        {{
             add("axaxa");
             add("bxb");
             add("xcx");
        }};

        List<String> target = new ArrayList<String>()
        {{
             add("aaa");
             add("bb");
             add("c");
        }};

        assertTrue(target.equals(Utils.removeAllX(arr)));
    }

    @Test
    public void removeAllX_case_three()
    {
        List<String> arr = new ArrayList<String>();
        List<String> target = new ArrayList<String>();

        assertTrue(target.equals(Utils.removeAllX(arr)));
    }

    @Test
    public void removeAllX_case_four()
    {
        List<String> arr = new ArrayList<String>()
        {{
             add("xxax");
             add("xbxbx");
             add("xxcx");
        }};

        List<String> target = new ArrayList<String>()
        {{
             add("a");
             add("bb");
             add("c");
        }};

        assertTrue(target.equals(Utils.removeAllX(arr)));
    }

    @Test
    public void removeAllX_case_five()
    {
        List<String> arr = new ArrayList<String>()
        {{
             add("x");
        }};

        List<String> target = new ArrayList<String>()
        {{
             add("");
        }};

        assertTrue(target.equals(Utils.removeAllX(arr)));
    }
}
