package user;
/*
 * The Person class is a abstract class that holds the first 
 * name and last name of an individual. Classes representing 
 * a person should inherit from this class.
 */
public abstract class Person 
{
	public String firstName;
	public String lastName;
	public String sex;
	public String dob;
	public String phoneNumber;
	public String email;
	
	public Person(String firstName, String lastName, String sex, String dob, String phoneNumber, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
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
}
