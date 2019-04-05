package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import system.ValidateInput;

//JUnit Test for the validateInput class
public class JUnit_ValidateInput {

	//Create new instance of ValidateInput to use for tests
	ValidateInput validTest = new ValidateInput();
	
	@Test // Testing the validation of patient attributes
	public void validPatient() {
		assertTrue(validTest.validatePatient("John", "Doe", "01","12","1965","587-829-9134", "johndoe@mail.com"));
		assertTrue(validTest.validatePatient("Jane", "Shmo", "11","01","2019","4039212350", "janes@mail.ca"));
	}
	
	@Test // Testing the detection of invalid patient attributes
	public void invalidPatient() {
		assertFalse(validTest.validatePatient("John", "Do1", "01","12","1965","587-829-9134", "johndoe@mail.com"));
		assertFalse(validTest.validatePatient("Jane", "Shmo", "13","1","2025","4039212350", "janes@mail.ca"));
	}
	
	@Test // Testing the validation of appointment attributes
	public void validAppointment() {
		assertTrue(validTest.validateAppointment("20/05/2019", "06:00", "07:00"));
		assertTrue(validTest.validateAppointment("29/02/2024", "08:00", "09:00"));
	}
	
	@Test // Testing the detection of invalid appointment attributes
	public void ivalidAppointment() {
		assertFalse(validTest.validateAppointment("29/02/2019", "07:00", "07:00"));
		assertFalse(validTest.validateAppointment("31/13/2024", "08:00", "09:00"));
	}
	
	@Test // Testing the validation of correct name entries
	public void validName() {
		assertTrue(validTest.validateName("Matthew"));
		assertTrue(validTest.validateName("Chewbacca"));
	}
	
	@Test // Testing the detection of invalid name entries
	public void invalidName() { 
		assertFalse(validTest.validateName("M@tthew!"));
		assertFalse(validTest.validateName("C3po"));
	}
	
	@Test // Testing the validation of correct day entries
	public void validDay() {
		assertTrue(validTest.validateDay("25", "02", "1999"));
		assertTrue(validTest.validateDay("01", "12", "2019"));
	}
	
	@Test // Testing the detection of invalid day entries
	public void invalidDay() { 
		assertFalse(validTest.validateDay("39", "12", "2018"));
		assertFalse(validTest.validateDay("31", "04", "2019"));
	}
	
	@Test // Testing the validation of correct month entries
	public void validMonth() {
		assertTrue(validTest.validateMonth("01"));
		assertTrue(validTest.validateMonth("12"));
	}
	
	@Test // Testing the detection of invalid month entries
	public void invalidMonth() { 
		assertFalse(validTest.validateMonth("0th"));
		assertFalse(validTest.validateMonth("13"));
	}
	
	@Test // Testing the validation of correct years in the future
	public void validFutureYear() {
		assertTrue(validTest.isFutureYear("2020"));
		assertTrue(validTest.isFutureYear("3000"));
	}
	
	@Test // Testing the detection of invalid future years
	public void invalidFutureYear() { 
		assertFalse(validTest.isFutureYear("2018"));
		assertFalse(validTest.isFutureYear("21"));
	}
	
	@Test // Testing the validation of correct years in the past
	public void validPastYear() {
		assertTrue(validTest.isPastYear("2018"));
		assertTrue(validTest.isPastYear("1"));
	}
	
	@Test // Testing the detection of invalid past years
	public void invalidPastYear() { 
		assertFalse(validTest.isPastYear("2020"));
		assertFalse(validTest.isPastYear("-1"));
	}
	
	@Test // Testing the validation of correctly formatted phone numbers
	public void validPhone() {
		assertTrue(validTest.validatePhone("403-435-2021"));
		assertTrue(validTest.validatePhone("5878932310"));
	}
	
	@Test // Testing the detection of invalid phone numbers
	public void invalidPhone() { 
		assertFalse(validTest.validatePhone("433-121-103!"));
		assertFalse(validTest.validatePhone("0"));
	}
	
	@Test // Testing the validation of correctly formatted email addresses
	public void validEmail() {
		assertTrue(validTest.validateEmail("johndoe1@mail.com"));
		assertTrue(validTest.validateEmail("jane.shmo@yo.ca"));
	}
	
	@Test // Testing the detection of invalid email addresses
	public void invalidEmail() { 
		assertFalse(validTest.validateEmail("testing@mail,com"));
		assertFalse(validTest.validateEmail("kimabell@123@.ca"));
	}
	
	@Test // Testing the validation of correctly formatted (future) dates
	public void validDate() {
		assertTrue(validTest.validateDate("25/09/2019"));
		assertTrue(validTest.validateDate("29/02/2024"));
	}
	
	@Test // Testing the detection of invalid appointment date entries
	public void invalidDate() { 
		assertFalse(validTest.validateDate("01/25/2000"));
		assertFalse(validTest.validateDate("01/2/5/2019"));
	}
	
	@Test // Testing the validation of correct appointment times
	public void validTime() {
		assertTrue(validTest.validateTime("06:30", "07:00"));
		assertTrue(validTest.validateTime("09:00", "09:30"));
	}
	
	@Test // Testing the detection of invalid appointment time entries
	public void invalidTime() { 
		assertFalse(validTest.validateTime("07:00", "06:00"));
		assertFalse(validTest.validateTime("09:00","09:00"));
	}
	
	@Test // Testing the validation entries consisting of only digits
	public void validDigits() {
		assertTrue(validTest.allDigits("9630"));
		assertTrue(validTest.allDigits("1234567890"));
	}
	
	@Test // Testing the detection of entries that contain other symbols than digits
	public void invalidDigits() { 
		assertFalse(validTest.allDigits("07:0"));
		assertFalse(validTest.allDigits("H3770"));
	}
}
