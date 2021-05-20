package com.mynt.parcel.calculator;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.api.Rates;

public class LargeParcelCalculator implements Calculator
{
	@Override
	public Double getCost(Parcel parcel) 
	{
		Double volume = parcel.getHeight() * parcel.getWidth() * parcel.getLength();
		return Rates.LARGE_PARCEL.getRate() * volume;
	}
}
