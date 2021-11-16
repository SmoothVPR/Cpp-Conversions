package com.ss.assn.two;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.time.Year;
import java.time.Month;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;

public class Utils
{
    public static Map<String, Integer> getYearMonths(int yyyy)
    {
        Map<String, Integer> res = new LinkedHashMap<String, Integer>();

        for (Month mm : Month.values())
        {
            YearMonth ym = YearMonth.of(yyyy, mm);
            res.put(mm.name(), ym.lengthOfMonth());
        }

        return res;
    }

    public static List<String> getMondaysOfMonth(int mm)
    {
        List<String> res = new ArrayList<String>();

        LocalDate date = Year.now()
                         .atMonth(mm)
                         .atDay(1)
                         .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        Month monthIt = date.getMonth();
        while (monthIt.getValue() == mm)
        {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

            monthIt = date.getMonth(); // Increment iterator
        }


        return res;
    }

    public static boolean isSpooky(LocalDate dt)
    {
        return ( (dt.get(DAY_OF_MONTH) == 13) && (dt.get(DAY_OF_WEEK) == 5) );
    }
}
