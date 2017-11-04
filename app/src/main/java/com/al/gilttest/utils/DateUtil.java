package com.al.gilttest.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Provides method to calculate period when sale ends
 */
public class DateUtil {

    /* Fix that shit!!!!!!!!!!!!!!!!!!
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */

    private static String simpleDateFormatting = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private Date today = Calendar.getInstance().getTime();

    DateUtil() {
    }

    /**
     * Compare current date and date when sale finish
     *
     * @param end String value ISO-8601-formatted time for end of sale
     * @return number of days
     */
    public static long interval(String end) {
        DateFormat format = new SimpleDateFormat(simpleDateFormatting, Locale.getDefault());
        long currentDate = System.currentTimeMillis();
        long diff = 0;
        try {
            Date ends = format.parse(end);
            diff = ends.getTime() - currentDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
