package com.lseg;

import java.text.DecimalFormat;
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
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150131() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-01-31"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("0",  df.format(cumulativeReturnValue));
	}
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150228() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-02-28"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("0.05",  df.format(cumulativeReturnValue));
	}
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150313() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-03-13"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("0.05",  df.format(cumulativeReturnValue));
	}
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150430() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-04-30"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("0.08675",  df.format(cumulativeReturnValue));
	}
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150508() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-05-08"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("0.08675",  df.format(cumulativeReturnValue));
	}
	
	@Test
	public void testCumulativeReturnsCalculatorDailyReturnsCaseAsof20150630() throws ParseException {
		CumulativeReturnsCalculator  cumulativeCalulator = CumulativeReturnsCalculator.getInstance();

		cumulativeCalulator.put(DateUtils.getDateFormat("2015-01-10"), new Double(0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-02-10"), new Double(0.05));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-10"), new Double(0.15));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-04-15"), new Double(-0.10));
		cumulativeCalulator.put(DateUtils.getDateFormat("2015-06-10"), new Double(-0.12));
        double cumulativeReturnValue = cumulativeCalulator.findCumulativeReturn(DateUtils.getDateFormat("2015-06-30"), DateUtils.getDateFormat("2015-02-01"));
		
		DecimalFormat df = new DecimalFormat("#.######");
		Assert.assertEquals("-0.04366",  df.format(cumulativeReturnValue));
	}
	

}
