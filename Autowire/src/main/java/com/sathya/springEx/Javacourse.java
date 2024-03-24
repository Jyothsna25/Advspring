package com.sathya.springEx;

import org.springframework.stereotype.Component;

@Component
public class Javacourse  implements messageservice{

	@Override
	public void message() {
		System.out.println("JAVA FULL STACK COURSE..");
		System.out.println("core java,Advance java,Spring,Springboot,Microservices..");
		
	}
}
