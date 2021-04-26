package com.lseg;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import com.lseg.calculator.CumulativeReturnsCalculator;
import com.lseg.utils.DateUtils;

public class CumulativeReturnsCalculatorTest {
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsData() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		Assert.assertEquals(1, CumulativeReturnsCalculator.getInstance().getDailyReturnData().size());
		Map<Date, Double> values = CumulativeReturnsCalculator.getInstance().getDailyReturnData();
		Assert.assertEquals(new Double(0.10), values.get(DateUtils.getDateFormat("2015-01-10")));
	}
	

}
