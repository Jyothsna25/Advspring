package com.sathya.springEx.javabased1;

public class person {
	private static String name;
	private static String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static void personinfo()
	{
		System.out.println("hey "+name+"welcome to spring classes");
		System.out.println("your email.."+email);
	}
	public person() {
System.out.println("objected created..");
}

}
