package com.sathya.springEx.JavaBasedConfig;

public class pharmacy 
{
private  String name;
private  String location;
public pharmacy(String name, String location) {
	super();
	this.name = name;
	this.location = location;
}
public void pharmacyinfo()
{
	System.out.println("pharamcy name "+name+" ");
	System.out.println("location is "+location+" ");
}
}


