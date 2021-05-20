package com.mynt.parcel.api;

public enum ParcelCategory 
{
	REJECT(50D),
	HEAVY(10D),
	SMALL(1500D),
	MEDIUM(2500D),
	LARGE(null);
	
	private Double limit; 
	
	ParcelCategory(Double limit) 
	{
		this.limit = limit;
	}
	
	public Double getLimit() 
	{
		return this.limit;
	}
}
