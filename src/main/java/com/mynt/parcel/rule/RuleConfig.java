package com.mynt.parcel.rule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.mynt.parcel.calculator.HeavyParcelCalculator;
import com.mynt.parcel.calculator.LargeParcelCalculator;
import com.mynt.parcel.calculator.MediumParcelCalculator;
import com.mynt.parcel.calculator.SmallParcelCalculator;

@Configuration
public class RuleConfig 
{
	@Bean("com.mynt.parcel.rule.ParcelRule")
	public ParcelRule getParcelRule() 
	{
		List<Rule> rules = new ArrayList<>();
		
		final Rule reject = new RejectParcel(1);
		rules.add(reject);
		
		final Rule heavy = new HeavyParcel(2, new HeavyParcelCalculator());
		rules.add(heavy);
		
		final Rule small = new SmallParcel(3, new SmallParcelCalculator());
		rules.add(small);
		
		final Rule medium = new MediumParcel(4, new MediumParcelCalculator());
		rules.add(medium);
		
		final Rule large = new MediumParcel(5, new LargeParcelCalculator());
		rules.add(large);
		
		rules.sort((Rule r1, Rule r2) -> r1.getPriority().compareTo(r2.getPriority()));
		
		ParcelRule parcelRule = new ParcelRule(rules);
		return parcelRule;
	}
}



