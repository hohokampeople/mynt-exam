package com.mynt.parcel.rest.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.mynt.parcel.api.Constants;
import com.mynt.parcel.api.Voucher;

@Repository
public class VoucherRepository 
{
	@Autowired
	private RestTemplate restTemplate;
	
	public Double getDiscount(String voucherCode) 
	{	
		Voucher voucher = restTemplate.getForObject(Constants.VOUCHER_URL + voucherCode + "?key={0}", Voucher.class, Constants.VOUCHER_API_KEY);
		
		if(voucher!=null) {
			return voucher.getDiscount();
		}
		
		return 0D;
	}
}
