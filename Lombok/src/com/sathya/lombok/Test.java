package com.sathya.lombok;

public class Test {

	private static final Employee Employee = null;

	public static void main(String[] args) 
	{
		// by constructor injecting the values
	/* Employee e1 =new Employee(10,"anu",1000.45);
	 System.out.println(e1);
// by setters injecting the values
	 Employee e2=new Employee();
	 e2.setEmpid(200);
	 e2.setEmpname("anu");
	 e2.setEmpsalary(2000.45);
	 
	 System.out.println(e2.getEmpid()+""+e2.getEmpname()+""+e2.getEmpsalary());
	//by builder.... */
	 Employee employee= new  Employee.EmployeeBuilder()
			               .empid(101)
	                       .empname("jaanu")
	                       .empsalary(20000.45)
	                       .build();
	                       System.out.println(employee);
	                      
	}

}
