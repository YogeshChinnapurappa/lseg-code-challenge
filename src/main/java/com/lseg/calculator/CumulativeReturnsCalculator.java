package com.lseg.calculator;

import java.util.Date;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Cumulative Returns Calculator.
 * 
 * @author YChinnapurappa
 *
 */
public class CumulativeReturnsCalculator {

	private SortedMap<Date, Double> dailyReturnsData = new TreeMap<Date, Double>();

	private static CumulativeReturnsCalculator instance = null;

	private CumulativeReturnsCalculator() {
	}

	public static CumulativeReturnsCalculator getInstance() {
		if (instance == null)
			instance = new CumulativeReturnsCalculator();
		return instance;
	}

	public void put(Date date, Double value) {
		dailyReturnsData.put(date, value);

	}

	public SortedMap<Date, Double> getDailyReturnData() {
		return this.dailyReturnsData;
	}


	/**
	 * Calculate the Cumulative Returns based on As of now date and Base date.
	 * 
	 * @param asof
	 * @param base
	 * @return
	 */
	public double findCumulativeReturn(Date asof, Date base) {

		if (asof == null || base == null) {
			throw new IllegalArgumentException("As of Date is empty or Base date is empty");
		}

		double returnAmount = 0.0;
		int i = 0;
		for (Entry<Date, Double> dailyReturnMap : dailyReturnsData.entrySet()) {

			Date dailyReturnDate = dailyReturnMap.getKey();
			if (dailyReturnDate.after(base)) {
				if (asof.after(dailyReturnDate)) {
					if (i == 0) {
						returnAmount = (1 + dailyReturnMap.getValue());
						++i;
					} else {
						returnAmount = returnAmount * (1 + dailyReturnMap.getValue());
					}
				}
			}
		}
        if (returnAmount == 0) {
        	return 0.0;
        } else {
		  returnAmount = returnAmount - 1.0;
        }
		return returnAmount;

	}

}
