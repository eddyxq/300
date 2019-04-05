package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import user.Employee;
import user.Patient;

// JUnit Test for the Person class 
public class JUnit_Person {
	
	Patient testP = new Patient("Billy","bob","Male","01/01/1990","987654321","billy@hotmail.com");	// Create a child class as Person is abstract
	Employee testE = new Employee("Billy","bob","Female","02/02/1980","123456789","bob@gmail.com","Surgen");	// Create a child class as Person is abstract
	
	@Test // Test the phone num related methods
	public void personPhone() {
		assertEquals("987654321",testP.getPhoneNum()); // test the Patient version
		assertEquals("123456789",testE.getPhoneNum()); // test the Employee version
	}
	
	@Test // Test the email related methods
	public void personEmail() {
		assertEquals("billy@hotmail.com",testP.getEmail()); // test the patient version
		assertEquals("bob@gmail.com",testE.getEmail()); // test the employee version
	}
	
	@Test // Test the DOB related methods
	public void personDOB() {
		assertEquals("01/01/1990",testP.getDOB());	// test the patient version
		assertEquals("02/02/1980",testE.getDOB());	// test the employee version
	}
	
	@Test // Test the sex related methods
	public void personSex() {
		assertEquals("Male",testP.getSex()); // test the Patient version
		assertEquals("Female",testE.getSex()); // test the Employee version
	}
}
