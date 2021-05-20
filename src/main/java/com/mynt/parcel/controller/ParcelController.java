package com.mynt.parcel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.parcel.api.Parcel;
import com.mynt.parcel.service.ParcelService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/parcel")
public class ParcelController 
{
	@Autowired
	private ParcelService service;
	
	@ApiOperation(value = "Calculate Cost",response = Double.class)
	@GetMapping(path = "/cost", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<Double> getCost(@RequestParam(name="weight") Double weight, 
    									  @RequestParam(name="height") Double height,
    									  @RequestParam(name="width") Double width, 
    									  @RequestParam(name="length") Double length,
    									  @RequestParam(name="voucherCode", required = false) String voucherCode) {
		
	    final Parcel parcel = new Parcel();
	    parcel.setWeight(weight);
		parcel.setHeight(height);
		parcel.setWidth(width);
		parcel.setLength(length);
		parcel.setVoucherCode(voucherCode);
		
		return new ResponseEntity<>(service.getCost(parcel), HttpStatus.OK);
    }
}
