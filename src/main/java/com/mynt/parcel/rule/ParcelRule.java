package com.mynt.parcel.rule;

import java.util.List;
import java.util.Optional;

import com.mynt.parcel.api.Parcel;

public class ParcelRule 
{
	private List<Rule> rules;
	
	public ParcelRule(List<Rule> rules) 
	{
		this.rules = rules;
	}
	
	public Double getCost(Parcel parcel) {
		Double amount = 0D;
		Optional<Rule> matchedRule = rules.stream().filter(rule -> rule.isSatisfied(parcel)).findFirst();
		
		if(matchedRule.isPresent()) {
			amount = matchedRule.get().getCost(parcel);
		}
		
		return amount;
	}
}
