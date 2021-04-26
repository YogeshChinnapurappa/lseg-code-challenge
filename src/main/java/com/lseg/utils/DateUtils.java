package com.lseg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
	
	private static final  String DATE_FROMAT="yyyy-MM-dd";
	
	private DateUtils() {
		
	}
	
	public static Date getDateFormat(String dateString) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FROMAT, Locale.ENGLISH);
		return formatter.parse(dateString);
	}

}
