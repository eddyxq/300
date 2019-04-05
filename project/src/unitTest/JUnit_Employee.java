package unitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import user.Employee;

//JUnit Test for the Employee class
public class JUnit_Employee {
	Employee testE = new Employee("Billy","bob","Male","01/01/1990","123456789","billy@hotmail.com","Surgen"); //Creates Test Employees
	
	@Test	// Test ID related methods
	public void employeeID() {
		testE.setId(10);	// Set the ID for the employee
		assertEquals(10,testE.getID());	// test the get ID method
		testE.setId(25);	// Set the ID for the employee
		assertEquals(25,testE.getID());		// Re test the get ID method
	}
	
	@Test // test the Department related functions
	public void employeeDepartment() {
		assertEquals("Surgen", testE.getDepartment());	// Test the get Department Method
		testE.department = "Admin";	// Set the department of the employee
		assertEquals("Admin", testE.getDepartment());	// Test the get Department Method
	}
	
	@Test	// Test the name related methods
	public void employeeName() {
		assertEquals("Billy",testE.getFirstName());	// Test the get First Name method
		assertEquals("bob",testE.getLastName());	// Test the get Last Name method
		assertEquals("Billy bob", testE.getName());	// Test the get Name method
		testE.firstName = "bill";	// set the first name
		testE.lastName = "joe";		// set the last name
		assertEquals("bill",testE.getFirstName());	// Test the get First Name Method
		assertEquals("joe",testE.getLastName());	// Test the get Last Name Method
		assertEquals("bill joe", testE.getName());	// Test the get Name Method
	}
}
