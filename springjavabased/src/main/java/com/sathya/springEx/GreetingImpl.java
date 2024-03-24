package com.sathya.springEx;
public class GreetingImpl implements Greeting
{
	
@Override
public void greet() 
{
	System.out.println(" WELCOME TO SPRING CLASSES...");
	System.out.println(" BY RATAN SIR...");
}
public GreetingImpl() {
	System.out.println("GreetingImpl constructor::object created");
}
}
