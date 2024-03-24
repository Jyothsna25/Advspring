package com.sathya.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor*/
@ToString
@Builder
public class Employee 
{
private int empid;
	private String empname;
	private double empsalary;
	
}
