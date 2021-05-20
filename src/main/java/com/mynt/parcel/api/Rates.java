package com.mynt.parcel.api;

public enum Rates 
{
	HEAVY_PARCEL(20.00),
	SMALL_PARCEL(0.03),
	MEDIUM_PARCEL(0.04),
	LARGE_PARCEL(0.05);
	
	private double rate; 
	
	Rates(Double rate) 
	{
		this.rate = rate;
	}
	
	public Double getRate() 
	{
		return this.rate;
	}
}
