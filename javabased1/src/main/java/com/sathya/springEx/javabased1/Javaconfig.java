package com.sathya.springEx.javabased1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig 
{
@Bean
public person person1()
{
	person person1=new person();
	person1.setName("jyothsna");
	person1.setEmail("chinni@gmail.com");
	return person1;
}
	@Bean
	public person person2()
	{
		person person21=new person();
		person21.setName("Anu");
		person21.setEmail("anu@gmail.com");
		return person21;

}
	@Bean
	public person person3()
	{
		person person22=new person();
		person22.setName("jaanu");
		person22.setEmail("jaanu@gmail.com");
		return person22;
}
}
