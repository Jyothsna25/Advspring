package com.sathya.springEx.javabased2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class javaconfig 
{
	@Bean
	public Emailservice emailservice()
	{
		Emailservice emailservice=new Emailservice();
		return emailservice;
		
	}
@Bean
public Javacourse javacourse()
{
	Javacourse javacourse=new Javacourse();
	return javacourse;
	
}
@Bean
public student student()
{
	student student=new student();
	student.setEmailservice(emailservice());
	student.setJavacourse(javacourse());
	return student;
	
}
}
