package com.ss.assn.two;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.time.Year;
import java.time.Month;
import java.time.LocalDate;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilsTest
{
    @Test
    public void getYearMonths_NotLeapYear()
    {
        int target_year = 1999;

        Map<String, Integer> target = new LinkedHashMap<String, Integer>()
        {{
             put("JANUARY",   31);
             put("FEBRUARY",  29);
             put("MARCH",     31);
             put("APRIL",     30);
             put("MAY",       31);
             put("JUNE",      30);
             put("JULY",      31);
             put("AUGUST",    31);
             put("SEPTEMBER", 30);
             put("OCTOBER",   31);
             put("NOVEMBER",  30);
             put("DECEMBER",  31);
        }};
        
        assertFalse(target.equals(Utils.getYearMonths(target_year)));
    }

    @Test
    public void getYearMonths_IsLeapYear()
    {
        int target_year = 1996;

        Map<String, Integer> target = new LinkedHashMap<String, Integer>()
        {{
             put("JANUARY",   31);
             put("FEBRUARY",  29);
             put("MARCH",     31);
             put("APRIL",     30);
             put("MAY",       31);
             put("JUNE",      30);
             put("JULY",      31);
             put("AUGUST",    31);
             put("SEPTEMBER", 30);
             put("OCTOBER",   31);
             put("NOVEMBER",  30);
             put("DECEMBER",  31);
        }};
        
        assertTrue(target.equals(Utils.getYearMonths(target_year)));
    }

    @Test
    public void getMondaysOfMonth_WrongDates()
    {
        int target_mm = 12; // December
        List<String> target = new ArrayList<String>()
        {{
            add("2021-12-07");
            add("2021-12-11");
            add("2021-12-22");
            add("2021-12-30");
        }};

        assertFalse(target.equals(Utils.getMondaysOfMonth(target_mm)));
    }

    @Test
    public void isSpooky_IsFridayIs13()
    {
        // August 13th is a Friday
        LocalDate date = Year.now().atMonth(8).atDay(13);

        assertTrue(Utils.isSpooky(date));
    }

    @Test
    public void isSpooky_IsFridayButNot13()
    {
        // August 13th is a Friday
        LocalDate date = Year.now().atMonth(8).atDay(6);

        assertFalse(Utils.isSpooky(date));
    }

    @Test
    public void isSpooky_NotFriday()
    {
        // August 12th is a Thursday
        LocalDate date = Year.now().atMonth(8).atDay(12);

        assertFalse(Utils.isSpooky(date));
    }
}
