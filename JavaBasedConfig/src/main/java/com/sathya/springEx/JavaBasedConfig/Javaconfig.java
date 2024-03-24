package com.sathya.springEx.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Javaconfig {
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(1,"jyo");
		return doctor;
	}
	@Bean
	public pharmacy pharmacy() 
	{
		pharmacy pharmacy=new pharmacy("jyothsna","hyderabad");
		return pharmacy;
	}
	
	@Bean
	public patient patient()
	{
	patient patient =new patient(doctor(),pharmacy());
	return patient;
}
}
