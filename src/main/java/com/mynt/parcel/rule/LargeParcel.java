package com.mynt.parcel.rule;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.calculator.Calculator;

public class LargeParcel implements Rule  
{
	private Calculator calculator;
	private Integer priority;
	
	public LargeParcel(int priority, Calculator calculator)
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
		return true;
	}

	@Override
	public Double getCost(Parcel parcel) 
	{
		return this.calculator.getCost(parcel);
	}
}
