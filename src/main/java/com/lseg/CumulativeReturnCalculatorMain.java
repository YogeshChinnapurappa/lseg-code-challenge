package com.lseg;

import java.text.ParseException;
import com.lseg.calculator.CumulativeReturnsCalculator;
import com.lseg.utils.DateUtils;

public class CumulativeReturnCalculatorMain {

	public static void main(String[] args) throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));


	}

}
