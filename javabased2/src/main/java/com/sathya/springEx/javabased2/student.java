package com.sathya.springEx.javabased2;

public class student
{
private Emailservice emailservice;
private Javacourse javacourse;
public Emailservice getEmailservice() {
	return emailservice;
}
public void setEmailservice(Emailservice emailservice) {
	this.emailservice = emailservice;
}
public Javacourse getJavacourse() {
	return javacourse;
}
public void setJavacourse(Javacourse javacourse) {
	this.javacourse = javacourse;
}


public void details()
{
emailservice.message();
javacourse.message();

}
}
