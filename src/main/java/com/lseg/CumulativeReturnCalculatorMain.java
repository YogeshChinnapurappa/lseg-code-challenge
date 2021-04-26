package com.lseg;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

import com.lseg.calculator.CumulativeReturnsCalculator;
import com.lseg.utils.DateUtils;
/**
 * Main class to execute Cumulative Calculator returns
 * input As of date and Base ate from console.
 * 
 * By Default the Cumulative Calculator is used stored in MAp as per the 
 * example given in the PDF.
 * 
 * @author YChinnapurappa
 *
 */
public class CumulativeReturnCalculatorMain {

	public static void main(String[] args) throws ParseException {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter As of Date (YYYY-MM-DD) ");
		String asof = myObj.nextLine();
		System.out.println("Enter Base Date (YYYY-MM-DD) ");
		String base = myObj.nextLine();
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
		
		double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat(asof), DateUtils.getDateFormat(base));
		
		DecimalFormat df = new DecimalFormat("#.######");
		System.out.println("Cumulative Return Value for the given asof and base date: " + df.format(cumulativeReturnValue));
		


	}

}
