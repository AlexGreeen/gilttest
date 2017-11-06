package com.al.gilttest.utils;

import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Provides method to calculate period when sale ends
 */
public class DateUtil {

    private static LocalDateTime now = LocalDateTime.now();
    private static String iso = "yyyy-MM-dd'T'HH:mm:ss'Z'";


    DateUtil() {
    }

//    static boolean isDays();

    public static int getDays(String s) {
        return Days.daysBetween(now, format(s)).getDays();
    }

    private static LocalDateTime format(String s) {
        DateTimeFormatter f = DateTimeFormat.forPattern(iso);
        return f.parseLocalDateTime(s);
    }
}
