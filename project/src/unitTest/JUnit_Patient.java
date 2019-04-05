package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import user.Employee;
import user.Patient;

public class JUnit_Patient {

	//Creates a test Patient to use in Tests
	Patient testP = new Patient("Billy","bob","Male","01/01/1990","123456789","billy@hotmail.com"); 
	
	@Test ///Tests the various Function relating to an appointment
	public void appointmentTest() { 
		
		testP.setAppointment("04/15/2019", "10:00", "bill"); //uses the Patients function to create an Appointment to be set
		assertEquals("MON, APR, 04, 2019 10:00",testP.getAppointment()); //tests the get Appointment function
		assertEquals("04/15/2019",testP.getAppointmentDate());//tests the get Appointment Date function
		assertEquals("10:00",testP.getAppointmentTime());//tests the get Appointment Time function
		
		testP.setAppointment("05/16/2019", "11:00", "bob"); //Creates a new Appointment
		assertEquals("THU, MAY, 05, 2019 11:00", testP.getAppointment()); //Re tests the get Appointment method
		assertEquals("05/16/2019",testP.getAppointmentDate()); //Re tests the get Appointment Date method
		assertEquals("11:00", testP.getAppointmentTime());//Re tests the get Appointment Time method
		
	}
	
	@Test // Tests the setting and getting of the id
	public void patientID()	{
		testP.setId(22);	//attempts to set the ID
		assertEquals(22,testP.getID()); //Tests if ID is the expected value
		testP.setId(27);	//attempts to change the ID
		assertEquals(27,testP.getID()); //Tests if the ID has changed in value
	}
	
	@Test // Tests the various Name methods for the patient
	public void patientName() {
		
		assertEquals("Billy",testP.getFirstName()); // Tests the get First Name method of the Patient
		assertEquals("bob",testP.getLastName());	// Tests the get Last Name method of the Patient
		assertEquals("Billy bob", testP.getName());	//Tests the get Name method of the Patient
		testP.firstName = "bill";	//changes the first name for further testing
		testP.lastName = "joe";		//changes the last name for further testing
		assertEquals("bill",testP.getFirstName());	// Re tests the get First Name method
		assertEquals("joe",testP.getLastName());	// Re tests the get Last Name method
		assertEquals("bill joe", testP.getName());	// Re tests the get Name method
	}
	
	@Test
	public void pateintDoctor() {
		testP.setDoctor("Mike");	// Attempts to set the Patient's Doctor
		assertEquals("Mike",testP.getDoctor());	// Test the get Doctor method of the Patient
		testP.setDoctor("Lilly");	// Attempts to change the Patient's Doctor
		assertEquals("Lilly", testP.getDoctor());	// Test the get Doctor method of the Patient
	}
	
	
	
	
	
}
