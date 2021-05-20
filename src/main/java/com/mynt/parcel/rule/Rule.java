package com.mynt.parcel.rule;

import com.mynt.parcel.api.Parcel;

public interface Rule 
{
	public boolean isSatisfied(Parcel parcel);
	public Double getCost(Parcel parcel);
	public Integer getPriority();
}
