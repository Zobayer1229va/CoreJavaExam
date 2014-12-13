package empolyee.com;


public class EmployeeInfo extends ManageEmployees { 
	 
	  /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class. 
	  * Also, Employee interface can be implemented into an abstract class.So create an Abstract class 
	  * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class, 
	  * go to CnnEmployee class to apply all the fields and attributes. 
	  *  
	  * Important: YOU MUST USE the  
	  * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible. 
	  * Use all kind of keywords(super,this,static,final........) 
	  */ 
	 
	 
	 	/* 
	 	 * declare few static and final fields and some non-static fields 
	 	 */ 
	 	final static String companyName = "MyCompany, Inc."; 
	 	 
	 	/* 
	 	 * You must implement the logic for below 2 methods and  
	 	 * following 2 methods are prototype as well for other methods need to be design, 
	 	 * as you will come up with the new ideas. 
	 	 */ 
	 	 
	 	/* 
	 	 * you must have multiple constructor. 
	 	 * Must implement below constructor. 
	 	 */ 
	 	EmployeeType employee; 
	 	 
	 	public EmployeeInfo(){ 
	 		NewEmployeeInfo(0, "", "", 0, 0, 0); 
	 	} 
	 	 
	 	public EmployeeInfo(int employeeId){ 
	 		NewEmployeeInfo(employeeId, "", "", 0, 0, 0); 
	 	} 
	 	 
	     public EmployeeInfo(int employeeId, String name){ 
	     	NewEmployeeInfo(employeeId, name, "", 0, 0, 0); 
	 	}
	     public EmployeeInfo(int employeeId, String name, String department){ 
	    	      	NewEmployeeInfo(employeeId, name, department, 0, 0, 0); 
	    	  	} 
	    	       
	    	      public EmployeeInfo(int employeeId, String name, String department, int salary){ 
	    	      	NewEmployeeInfo(employeeId, name, department, salary, 0, 0); 
	    	  	} 
	    	  
	    	  
	    	      // initialize employee variable 
	    	      private void NewEmployeeInfo(int employeeId, String name,  
	    	      		String department, int salary, double commission, int year) { 
	    	  		employee = new EmployeeType(); 
	    	  		employee.employeeName = name; 
	    	  		employee.employeeId = employeeId; 
	    	  		employee.salary = salary; 
	    	  		employee.department = department; 
	    	  		employee.commission = commission; 
	    	  		employee.year = year; 
	    	  	} 





/* 
	 * This methods should calculate Employee bonus based on salary and performance. 
	 * Then it will return the total yearly bonus. So you need to implement the logic. 
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.  
	 * You can set arbitrary number for performance. 
	 * So you probably need to send 2 arguments. 
	 *  
	 */ 
	public static int calculateEmployeBonus(){ 
		int total=0; 
		for (EmployeeType emp : employees ) { 
			total += emp.salary * emp.commission; 
		} 
		return total; 
	} 
	 
	/* 
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company. 
	 * Then it will return the total pension. So you need to implement the logic. 
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on. 
	 * So you probably need to send 2 arguments. 
	 *  
	 */ 
	public static int calculateEmployePension(){ 
		int total=0; 
		for (EmployeeType emp : employees ) { 
			total += emp.salary * emp.year * 0.05; 
		} 
		return total; 
	} 


	// return number of employees 
	public int getNumberOfEmployees() { 
		return employees.size(); 
	} 
	 
	public void setCommissionPersentage(int empId, double commission) { 
		for (EmployeeType emp : employees ) { 
			if ( emp.employeeId == empId ) { 
				emp.commission = commission; 
				break; 
			}
		}
	}
	public void setEmployeeYear(int empId, int year) { 
		for (EmployeeType emp : employees ) { 
			if ( emp.employeeId == empId ) { 
				emp.year = year; 
				break; 
}
}
		}

	public int getEmployeeYear(int empId) { 
		int year = 0; 
		for (EmployeeType emp : employees ) { 
			if ( emp.employeeId == empId ) { 
				year = emp.year; 
				break; 
			} 
		} 
		return year; 
	} 
	 
	@Override 
	public void benefitLayout() { 
		System.out.println("Benifit layout is not available yet..."); 
	} 


	public double getCommissionPersentage(int empId) { 
		double cms = 0.0; 
		for (EmployeeType emp : employees ) { 
			if ( emp.employeeId == empId ) { 
				cms = emp.commission; 
				break; 
			} 
		} 
		return cms; 
	} 

}
