package com.sathya.springEx;

import org.springframework.stereotype.Component;
@Component

public class Emailservice implements messageservice {




	@Override
	public void message() {
		System.out.println("Email is updated...");
		System.out.println("Check your email..");
		
	}


}
