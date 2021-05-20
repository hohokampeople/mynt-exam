package com.mynt.parcel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.rest.repository.VoucherRepository;
import com.mynt.parcel.rule.ParcelRule;

@Service
public class ParcelService 
{
	@Autowired
	@Qualifier("com.mynt.parcel.rule.ParcelRule")
	private ParcelRule parcelRule;
	
	@Autowired
	private VoucherRepository repository;
	
	public Double getCost(final Parcel parcel) 
	{
		Double cost = parcelRule.getCost(parcel);
		
		if(parcel.getVoucherCode()!=null) {
			Double discount = repository.getDiscount(parcel.getVoucherCode());
			cost = cost - discount;
		}
		
		return cost;
	}
}
