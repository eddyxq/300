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
	public String department = "null";
	
	public Employee(String firstName, String lastName, String sex, String dob, String phoneNumber, String email, String department) 
	{
		super(firstName, lastName);
		this.sex = sex;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.department = department;
	}
	/*
	 * This method will set the patient ID.
	 * @param id The employee's ID
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/*
	 * This method returns the employee's ID.
	 */
	public int getID() 
	{
		return id;
	}
	/*
	 * This method returns the employee's department.
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
	 * This method returns the employee's first name.
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	/*
	 * This method returns the employee's last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
	/*
	 * This method returns the employee's phone number.
	 */
	public String getPhoneNum()
	{
		return phoneNumber;
	}
	/*
	 * This method returns the employee's email.
	 */
	public String getEmail() 
	{
		return email;
	}
	/*
	 * This method returns the employee's date of birth.
	 */
	public String getDOB() 
	{
		return dob;
	}
	/*
	 * This method returns the employee's sex.
	 */
	public String getSex() 
	{
		return sex;
	}
}
