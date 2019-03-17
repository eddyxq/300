package user;
/*
 * This class defines the operation staff
 * that works at the hospital.
 */
public abstract class Operation_Staff extends Person
{
	private int id;
	
	public Operation_Staff(String firstName, String lastName)
	{
		super(firstName, lastName);
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
}
