package com.sathya.springEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Javaconfig 
{
 @Bean
public GreetingImpl greet()
{
	 GreetingImpl greetingimpl=new GreetingImpl();
	 return greetingimpl;
}
}
