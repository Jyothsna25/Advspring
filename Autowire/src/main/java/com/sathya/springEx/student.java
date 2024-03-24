package com.sathya.springEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
	@Autowired
	private Emailservice emailservice;
   
	@Autowired
	private Javacourse javacourse;
	

   /* @Autowired
	public student(Emailservice emailservice, Javacourse javacourse) {
		super();
		this.emailservice = emailservice;
		this.javacourse = javacourse;
	}*/



	/*public Emailservice getEmailservice() {
		return emailservice;
	}

    @Autowired
	public void setEmailservice(Emailservice emailservice) {
		this.emailservice = emailservice;
	}


	public Javacourse getJavacourse() {
		return javacourse;
	}

    @Autowired
	public void setJavacourse(Javacourse javacourse) {
		this.javacourse = javacourse;
	}*/


	public void details()
	{
	emailservice.message();
	javacourse.message();

	}
	}



