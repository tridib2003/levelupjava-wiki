/*
 * Author: @tridib2003
 */

class Employee {
	String name;
	int empid;
	String role;
	
	// Constructor for Employee
	Employee() {
		System.out.println("Initializing Employee...");
		name = "Nitin";
		empid = 17941;
		role = "Analyst";
	}
	
	// This method displays the employee details
	void showDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Role: " + role);
	}
}

public class EmployeeConstDemo {

	public static void main(String[] args) {
		
		// Create an object 'emp1' of 'Employee' type
		Employee emp1 = new Employee();
		
		// Display employee details
		emp1.showDetails();
		
	}
}
