package com.sathya.springEx;

public class car implements vehicle
{
private String fueltype;
private int maxspeed;
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}
public int getMaxspeed() {
	return maxspeed;
}
public void setMaxspeed(int maxspeed) {
	this.maxspeed = maxspeed;
}
@Override
public void move() {
	System.out.println("FUELTYPE.."+fueltype);
	System.out.println("MAXSPEED..."+maxspeed);
}

}
