package user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * This class defines the role of the patient. 
 */
public class Employee extends Person
{
	private int id;
	public String sex;
	public String dob;
	public String phoneNumber;
	public String email;
	public String department;
	private String appointmentDate = "UNKNOWN";
	private String appointmentTime = "UNKNOWN";
	private boolean hasAppointment;
	Date dateNTime = new Date();
	
	public Employee(String firstName, String lastName, String sex, String dob, String phoneNumber, String email) 
	{
		super(firstName, lastName);
		this.sex = sex;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		hasAppointment = false;
	}
	/*
	 * This method will set the appointment date and time.
	 * @param date The date of the appointment
	 * @param date The time of the appointment
	 */
	public void setAppointment(String date, String time)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH);
		setAppointmentDate(date);
		setAppointmentTime(time);
		String dateTime = date + " " + time;
		try 
		{
			dateNTime = sdf.parse(dateTime);
		} 
		catch (ParseException e) {}
		hasAppointment = true;
	}
	public String getAppointment()
	{
		SimpleDateFormat format = new SimpleDateFormat("EEE, MMM, dd, yyyy HH:mm", Locale.ENGLISH);
		String dateTimeInString = format.format(dateNTime);
		return dateTimeInString;
	}
	/*
	 * This method will set the patient ID.
	 * @param id The patient's ID
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/*
	 * This method returns the patient's ID.
	 */
	public int getID() 
	{
		return id;
	}
	/*
	 * This method will set the patient ID.
	 * @param id The patient's ID
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}
	/*
	 * This method returns the patient's ID.
	 */
	public String getDepartment() 
	{
		return department;
	}
	/*
	 * This method returns the appointment time.
	 */
	public String getName() 
	{
		return firstName + " " + lastName;
	}
	/*
	 * This method returns the patient's first name.
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	/*
	 * This method returns the patient's last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
	/*
	 * This method returns the patient's phone number.
	 */
	public String getPhoneNum()
	{
		return phoneNumber;
	}
	/*
	 * This method returns the patient's email.
	 */
	public String getEmail() 
	{
		return email;
	}
	/*
	 * This method returns the patient's date of birth.
	 */
	public String getDOB() 
	{
		return dob;
	}
	/*
	 * This method returns the patient's sex.
	 */
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
	/*
	 * This method returns the appointment date.
	 */
	public String getAppointmentDate() 
	{
		return appointmentDate;
	}
	/*
	 * This method will set the appointment date.
	 * @param appointmentDate The date
	 */
	public void setAppointmentDate(String appointmentDate) 
	{
		this.appointmentDate = appointmentDate;
	}
	/*
	 * This method returns the appointment time.
	 */
	public String getAppointmentTime() 
	{
		return appointmentTime;
	}
	/*
	 * This method will set the appointment time.
	 * @param appointmentTime The time
	 */
	public void setAppointmentTime(String appointmentTime) 
	{
		this.appointmentTime = appointmentTime;
	}
}
