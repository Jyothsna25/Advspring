package com.sathya.springEx.JavaBasedConfig;

public class patient 
{
	private  String name;
	private  int age;;
     private Doctor doctor;
   private pharmacy pharmacy;
	public patient(Doctor doctor, com.sathya.springEx.JavaBasedConfig.pharmacy pharmacy) {
		super();
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
	public  void patientinfo()
	{
		System.out.println("hey"+name+"Welcome to Pharmacy");
		System.out.println("your age is.."+age);
		doctor.doctorinfo();
		pharmacy.pharmacyinfo();
	}

}