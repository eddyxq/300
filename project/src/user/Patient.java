package user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * This class defines the role of the patient. 
 */
public class Patient extends Person
{
	private int id;
	public String sex;
	public String dob;
	public String phoneNumber;
	public String email;
	
	private String appointmentDate;
	private String appointmentTime;
	private boolean hasAppointment;
	
	Date dateNTime = new Date();
	
	public Patient(String firstName, String lastName, String sex, String dob, String phoneNumber, String email) 
	{
		super(firstName, lastName);
		this.sex = sex;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		hasAppointment = false;
	}
	/*
	 * Setters for patient
	 */
	public void setAppointment(String date, String time)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH);
		setAppointmentDate(date);
		setAppointmentTime(time);
		String dateTime = date+ " " +time;
		try 
		{
			dateNTime = sdf.parse(dateTime);
		} 
		catch (ParseException e) 
		{
			
		}
		hasAppointment = true;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	/*
	 * Getters for patient
	 */
	public int getID() 
	{
		return id;
	}
	
	public String getAppointment()
	{
		SimpleDateFormat format = new SimpleDateFormat("EEE, MMM, dd, yyyy HH:mm", Locale.ENGLISH);
		String dateTimeInString = format.format(dateNTime);
		return dateTimeInString;
	}
	
	public String getName() 
	{
		return firstName + " " + lastName;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhoneNum()
	{
		return phoneNumber;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public String getDOB() 
	{
		return dob;
	}
	
	public String getSex() 
	{
		return sex;
	}
	/*
	 * This method returns true if the patient has a appointment booked
	 */
	public boolean hasAppointment() 
	{
		return hasAppointment;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
}
