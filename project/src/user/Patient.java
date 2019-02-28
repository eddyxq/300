package user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import display.ErrorMessages;

public class Patient extends Person
{
	private int id;
	private String appointmentDate;
	private String appointmentTime;
	private boolean hasAppointment;
	Date dateNTime = new Date();
	ErrorMessages error = new ErrorMessages();
	
	
	public Patient(String firstName, String lastName, int id) 
	{
		super(firstName, lastName);
		this.id = id;
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
		
		try {
			dateNTime = sdf.parse(dateTime);
		} catch (ParseException e) {
			error.invalidDateFormat();
		}
		
		hasAppointment = true;
	}
	
	public String getAppointment() {
		SimpleDateFormat format = new SimpleDateFormat("EEE, MMM, dd, yyyy HH:mm", Locale.ENGLISH);
		String dateTimeInString = format.format(dateNTime);
		return dateTimeInString;
	}
	
	/*
	 * Getters for patient
	 */
	public int getID() {
		return id;
	}
	
	public boolean hasAppointment() {
		return hasAppointment;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
}
