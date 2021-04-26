package com.lseg.calculator;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CumulativeReturnsCalculator {
	
	private Map<Date, Double> dailyReturnsData = new HashMap<Date, Double>();
	
	private static CumulativeReturnsCalculator instance = null;
	
	private CumulativeReturnsCalculator() {}
	
    public static CumulativeReturnsCalculator getInstance() {
        if (instance == null)
            instance = new CumulativeReturnsCalculator();
        return instance;
    }
	
    public void put(Date date, Double value) {
    	dailyReturnsData.put(date, value);
  	  
    }
    
    public Map<Date, Double> getDailyReturnData() {
    	return this.dailyReturnsData;
    }
    
    public double findCumulativeReturn(Date asof, Date base) {
		return 0;
    	
    }

}
