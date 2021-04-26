package com.lseg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.LocalDate;

public class DateUtils {
	
	private static final  String DATE_FROMAT="yyyy-MM-dd";
	
	private DateUtils() {
		
	}
	
	public static Date getDateFormat(String dateString) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FROMAT, Locale.ENGLISH);
		return formatter.parse(dateString);
	}
	
    public static boolean isBefore(java.time.LocalDate date1, java.time.LocalDate date2) {
        return date1 == null || date2 == null ? false : date1.isBefore(date2);
    }

    public static Date getLastDateOfMonth(Date originalDate) {
        LocalDate originalLocalDate = new LocalDate(originalDate);
        LocalDate lastDate = originalLocalDate.dayOfMonth().withMaximumValue();
        return lastDate.toDateTimeAtStartOfDay().toDate();
    }
}
