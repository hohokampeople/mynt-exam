package com.mynt.parcel.rule;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.api.ParcelCategory;


public class RejectParcel implements Rule 
{
	private Integer priority;
	
	public RejectParcel(int priority)
	{
		this.priority = priority;
	}
	
	@Override
	public Integer getPriority()
	{
		return this.priority;
	}
	
	@Override
	public boolean isSatisfied(Parcel parcel) 
	{
		if (ParcelCategory.REJECT.getLimit() < parcel.getWeight())
		{
			return true;
		}
		return false;
	}

	@Override
	public Double getCost(Parcel parcel)
	{
		return null;
	}
}
