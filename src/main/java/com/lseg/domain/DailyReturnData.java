package com.lseg.domain;

import java.util.Date;

public class DailyReturnData {
	
	private Date date;
	
	private Double dailyReturn;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getDailyReturn() {
		return dailyReturn;
	}
	public void setDailyReturn(Double dailyReturn) {
		this.dailyReturn = dailyReturn;
	}


}
