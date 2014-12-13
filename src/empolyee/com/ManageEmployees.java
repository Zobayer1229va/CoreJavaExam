package empolyee.com;

import java.util.ArrayList;
import java.util.List;

public abstract class ManageEmployees implements Employee {
	public static List<EmployeeType> employees = new ArrayList<EmployeeType>(); 
	 	 
	 	public int employeeId(String empName) { 
	 		int id = 0; 
	 		for ( EmployeeType emp : employees ) { 
	 			if ( emp.employeeName.equals(empName) ) { 
	 				id = emp.employeeId; 
	 				break; 
	 			} 
	 		} 
	 		return id; 
	 	} 
	 
	 
	 	public String employeeName(int empId) { 
	 		String empName = ""; 
	 		for ( EmployeeType emp : employees ) { 
	 			if ( emp.employeeId == empId ) { 
	 				empName = emp.employeeName; 
	 				break; 
	 			} 
	 		} 
	 		return empName; 
	 	} 
	 
	 
	 	public void assignDepartment(int empId, String deptName) { 
	 		for ( EmployeeType emp : employees ) { 
	 			if ( emp.employeeId == empId ) { 
	 				emp.department = deptName; 
	 				break; 
	 			} 
	 		} 
	 	} 
	 
	 
	 	public int calculateSalary() { 
	 		int salary = 0; 
	 		for ( EmployeeType emp : employees ) { 
	 			salary += emp.salary; 
	 		} 
	 		return salary; 
	 	} 
	 
	 
	 	public void benefitLayout() { 
	 		System.out.println("Benifit layout is available soon..."); 
	 	} 
	 
	 
	 	public String identifyDepartment(int empId) { 
	 		String deptName = ""; 
	 		for ( EmployeeType emp : employees ) { 
	 			if ( emp.employeeId == empId ) { 
	 				deptName = emp.department; 
	 				break; 
	 			} 
	 		} 
	 		return deptName; 
	 	} 
	 	 
	 	public abstract int getEmployeeYear(int empId); 
	 	public abstract void setEmployeeYear(int empId, int year); 
	 	public abstract double getCommissionPersentage(int empId); 
	 	public abstract void setCommissionPersentage(int empId, double commission); 
	 	public abstract int getNumberOfEmployees(); 
	 	 
	 	/* 
	 	 * you must declare some Inner classes here to demonstrate nested class structure. 
	 	 */ 
	 	 
	 	public class EmployeeType { 
	 		public int employeeId; 
	 		public String employeeName; 
	 		public String department; 
	 		public int salary; 
	 		public double commission; 
	 		public int year; 
	 	} 
}
