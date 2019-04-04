package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import user.Employee;
import user.Patient;

public class JUnit_User {

	Employee testE = new Employee("Billy","bob","Male","01/01/1990","123456789","billy@hotmail.com","Surgen");
	@Test
	public void employeeID() {
		testE.setId(10);
		assertEquals(10,testE.getID());
		testE.setId(25);
		assertEquals(25,testE.getID());	
	}
	
	@Test
	public void employeeDepartment() {
		assertEquals("Surgen", testE.getDepartment());
		testE.department = "Admin";
		assertEquals("Admin", testE.getDepartment());
	}
	
	@Test
	public void employeeName() {
		assertEquals("Billy",testE.getFirstName());
		assertEquals("bob",testE.getLastName());
		assertEquals("Billy bob", testE.getName());
		testE.firstName = "bill";
		testE.lastName = "joe";
		assertEquals("bill",testE.getFirstName());
		assertEquals("joe",testE.getLastName());
		assertEquals("bill joe", testE.getName());
	}
	
	
	Patient testP = new Patient("Billy","bob","Male","01/01/1990","123456789","billy@hotmail.com");
	
	@Test 
	public void appointmentTest() {
		
		testP.setAppointment("04/15/2019", "10:00", "bill");
		assertEquals("Mon, Apr, 04, 2019 10:00",testP.getAppointment());
		assertEquals("04/15/2019",testP.getAppointmentDate());
		assertEquals("10:00",testP.getAppointmentTime());
		
		testP.setAppointment("05/16/2019", "11:00", "bob");
		assertEquals("Thu, May, 05, 2019 11:00", testP.getAppointment());
		assertEquals("05/16/2019",testP.getAppointmentDate());
		assertEquals("11:00", testP.getAppointmentTime());
		
	}
	
	@Test
	public void patientID()	{
		testP.setId(22);
		assertEquals(22,testP.getID());
		testP.setId(27);
		assertEquals(27,testP.getID());
	}
	
	@Test
	public void patientName() {
		assertEquals("Billy",testP.getFirstName());
		assertEquals("bob",testP.getLastName());
		assertEquals("Billy bob", testP.getName());
		testP.firstName = "bill";
		testP.lastName = "joe";
		assertEquals("bill",testP.getFirstName());
		assertEquals("joe",testP.getLastName());
		assertEquals("bill joe", testP.getName());
	}
	
	@Test
	public void pateintDoctor() {
		testP.setDoctor("Mike");
		assertEquals("Mike",testP.getDoctor());
		testP.setDoctor("Lilly");
		assertEquals("Lilly", testP.getDoctor());
	}
	
	
	@Test
	public void personPhone() {
		assertEquals("123456789",testP.getPhoneNum());
		assertEquals("123456789", testE.getPhoneNum());
	}
	
	@Test
	public void personEmail() {
		assertEquals("billy@hotmail.com",testP.getEmail());
		assertEquals("billy@hotmail.com", testE.getEmail());
	}
	
	@Test
	public void personDOB() {
		assertEquals("01/01/1990",testP.getDOB());
		assertEquals("01/01/1990",testE.getDOB());
	}
	
	@Test
	public void personSex() {
		assertEquals("Male",testP.getSex());
		assertEquals("Male",testE.getSex());
	}
	
	
	
}
