package com.mynt.parcel.calculator;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.api.Rates;

public class HeavyParcelCalculator implements Calculator 
{
	@Override
	public Double getCost(Parcel parcel) 
	{
		return Rates.HEAVY_PARCEL.getRate() * parcel.getWeight();
	}
}
