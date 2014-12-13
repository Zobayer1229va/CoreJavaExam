package empolyee.com;


public class CnnEmployee {
	 /* 
 	 * CnnEmployee class has a main methods where you will be able to create Object from  
 	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible  
 	 * to use with proper business work flow.Think as a Software Architect, Product Designer and  
 	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate 
 	 * more to design an application that will meet for fortune 500 Employee Information 
 	 * Services. 
 	 *  
 	 **/ 
 	public static void main(String[] args) { 
 

 		EmployeeInfo empInfo = new EmployeeInfo(); 
 		empInfo.employee.employeeId = 1; 
 		empInfo.employee.employeeName = "Employee One"; 
 		empInfo.employee.department = "Development"; 
 		empInfo.employee.salary = 6000; 
 		empInfo.employee.commission = 0.06; 
 		empInfo.employee.year = 1; 
 		ManageEmployees.employees.add(empInfo.employee); 
 		 
 		empInfo = new EmployeeInfo(2); 
 		empInfo.employee.employeeName = "Employee Two"; 
 		empInfo.employee.department = "Development"; 
 		empInfo.employee.salary = 4500; 
 		empInfo.employee.commission = 0.08; 
 		empInfo.employee.year = 2; 
 		ManageEmployees.employees.add(empInfo.employee); 
 
 
 		empInfo = new EmployeeInfo(3, "Employee Three"); 
 		empInfo.employee.department = "Development"; 
 		empInfo.employee.salary = 4500; 
 		empInfo.employee.commission = 0.08; 
 		empInfo.employee.year = 2; 
 		ManageEmployees.employees.add(empInfo.employee); 
 		 
 		empInfo = new EmployeeInfo(4, "Employee Four", "QA"); 
 		empInfo.employee.salary = 5500; 
 		empInfo.employee.commission = 0.05; 
 		empInfo.employee.year = 2; 
 		ManageEmployees.employees.add(empInfo.employee); 
 		 
 		empInfo = new EmployeeInfo(5, "Employee Five", "Financial", 5000); 
 		empInfo.employee.commission = 0.1; 
 		empInfo.employee.year = 5; 
 		ManageEmployees.employees.add(empInfo.employee); 
 		 
 		empInfo = new EmployeeInfo(6, "Employee Six", "HR", 7000); 
 		empInfo.employee.commission = 0.08; 
 		empInfo.employee.year = 3; 
 		ManageEmployees.employees.add(empInfo.employee); 
 
 
 		System.out.println("Company name is: " + EmployeeInfo.companyName); 
 		 
 		System.out.println("Total number of employees is: " + empInfo.getNumberOfEmployees()); 
 		 
 		System.out.println(); 
 		System.out.println("Before change:"); 
 		System.out.println("Total salary: " + empInfo.calculateSalary()); 
 		System.out.println("Total bonus: " + EmployeeInfo.calculateEmployeBonus()); 
 		System.out.println("Total pension: " + EmployeeInfo.calculateEmployePension()); 
 		 
 		System.out.println(); 
		 
 		// override 
 		empInfo.benefitLayout(); 
 		 
 		System.out.println(); 
 		String name = "Employee Five"; 
 		System.out.println("Employee ID of employee <" + name + "> is: " + empInfo.employeeId(name)); 
 		 
 		int id = 3; 
 		System.out.println("Employee name of employees[" + id + "] is: " + empInfo.employeeName(id)); 
 		System.out.println("Employees[" + id + "] is belongs to: " + empInfo.identifyDepartment(id) + " department."); 
 		empInfo.assignDepartment(id, "QA"); 
 		System.out.println("Employees[" + id + "] is assigned to: " + empInfo.identifyDepartment(id) + " department."); 
 		 
 		System.out.println("Employees[" + id + "] has worked for: " + empInfo.getEmployeeYear(id) + " year(s)."); 
		empInfo.setEmployeeYear(id, 5); 
 		System.out.println("Employees[" + id + "]'s work history changed to: " + empInfo.getEmployeeYear(id) + " year(s)."); 
 		 
 		id = 5; 
 		System.out.println("Employees[" + id + "] has a performance index: " + empInfo.getCommissionPersentage(id)); 
 		empInfo.setCommissionPersentage(id, 0.04); 
 		System.out.println("Employees[" + id + "]'s performance index changed to: " + empInfo.getCommissionPersentage(id)); 
 		 
 		System.out.println(); 
 		System.out.println("After change: "); 
 		System.out.println("Total salary: " + empInfo.calculateSalary()); 
 		System.out.println("Total bonus: " + EmployeeInfo.calculateEmployeBonus()); 
 		System.out.println("Total pension: " + EmployeeInfo.calculateEmployePension()); 
 	} 


}

