package com.mynt.parcel.calculator;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.api.Rates;

public class SmallParcelCalculator implements Calculator 
{
	@Override
	public Double getCost(Parcel parcel) 
	{
		Double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
		return Rates.SMALL_PARCEL.getRate() * volume;
	}
}
