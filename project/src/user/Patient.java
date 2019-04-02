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
	private String appointmentDate = "UNKNOWN";
	private String appointmentTime = "UNKNOWN";
	private String doctor = "UNKNOWN";
	Date dateNTime = new Date();
	/*
	 * This Constructor will initialize the Patient fields.
	 */
	public Patient(String firstName, String lastName, String sex, String dob, String phoneNumber, String email) 
	{
		super(firstName, lastName, sex, dob, phoneNumber, email);
	}
	/*
	 * This method will set the appointment date and time.
	 * @param date The date of the appointment
	 * @param date The time of the appointment
	 */
	public void setAppointment(String date, String time, String doctor)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH);
		setAppointmentDate(date);
		setAppointmentTime(time);
		//remove the spaces so it becomes one word string
		doctor = doctor.replaceAll(" ", "");
		setDoctor(doctor);
		String dateTime = date + " " + time;
		try 
		{
			dateNTime = sdf.parse(dateTime);
		} 
		catch (ParseException e) {}
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
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
}
