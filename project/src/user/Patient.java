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
		appointmentDate = date;
		appointmentTime = time;
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
	/*
	 * This method returns true if the patient has a appointment booked
	 */
	public boolean hasAppointment() 
	{
		return hasAppointment;
	}
}
