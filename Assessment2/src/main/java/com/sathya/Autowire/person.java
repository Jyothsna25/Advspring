package com.sathya.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class person 
{
	@Autowired
	private Homeloanservice homeloanservice;
	@Autowired
	private Realestateservice realestateservice;

	public void details()
	{
		homeloanservice.loaninfo();
		realestateservice.realestateinfo();
	}
}
