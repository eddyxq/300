package user;

/*
 * This class defines the role of the patient. 
 */
public class Employee extends Person
{
	private int id;
	public String department = "null";
	/*
	 * This Constructor will initialize the employee fields.
	 */
	public Employee(String firstName, String lastName, String sex, String dob, String phoneNumber, String email, String department) 
	{
		super(firstName, lastName, sex, dob, phoneNumber, email);
		this.department = department;
	}
	/**
	 * This method will set the patient ID.
	 * @param id The employee's ID
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * This method returns the employee's ID.
	 */
	public int getID() 
	{
		return id;
	}
	/**
	 * This method returns the employee's department.
	 */
	public String getDepartment() 
	{
		return department;
	}
	/**
	 * This method returns the appointment time.
	 */
	public String getName() 
	{
		return firstName + " " + lastName;
	}
	/**
	 * This method returns the employee's first name.
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	/**
	 * This method returns the employee's last name.
	 */
	public String getLastName()
	{
		return lastName;
	}
}
