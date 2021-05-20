package com.mynt.parcel.rule;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.api.ParcelCategory;
import com.mynt.parcel.calculator.Calculator;

public class SmallParcel implements Rule  
{
	private Calculator calculator;
	private Integer priority;
	
	public SmallParcel(int priority, Calculator calculator)
	{
		this.priority = priority;
		this.calculator = calculator;
	}
	
	@Override
	public Integer getPriority()
	{
		return this.priority;
	}
	
	@Override
	public boolean isSatisfied(Parcel parcel) 
	{
		double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
		
		if(ParcelCategory.SMALL.getLimit() > volume) {
			return true;
		}
		
		return false;
	}

	@Override
	public Double getCost(Parcel parcel) 
	{
		return calculator.getCost(parcel);
	}
}
