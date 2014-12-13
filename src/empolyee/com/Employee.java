package empolyee.com;

public interface Employee {
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods 
	 *has been declared in below. you need to brainstorm to add more methods to meet the business requirements. 
	 * 
	 *please read the following method and understand the business requirements of these following methods 
	 *and then implement these in a concrete class. 
	 *  
	 */ 
	 
	// employeeId() will return employee id. 
	public int employeeId(String empName); 
	 
	// employeeName() will return employee name by employee ID 
	public String employeeName(int empId); 
	 
	// assignDepartment() will assign employee to departments 
    public void assignDepartment(int empId, String deptName); 
	 
	// calculate employee salary 
	public int calculateSalary(); 
	 
	// employee benefit 
	public void benefitLayout(); 
	 
	// identify employee's department by employee ID 
	public String identifyDepartment(int empId); 

}
