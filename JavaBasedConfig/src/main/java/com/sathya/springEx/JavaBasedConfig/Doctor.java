package com.sathya.springEx.JavaBasedConfig;

public class Doctor {
	private int id;
	private String name;
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void doctorinfo()
	{
		System.out.println("doctor id"+id+ " ");
		System.out.println("doctor name"+name+" ");
	}
}


