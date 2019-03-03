package user;
/*
 * The Physician class is a abstract class that holds the 
 * information of the doctors that work at the hospital. 
 */
public abstract class Physician extends Operation_Staff
{
	public Physician(String firstName, String lastName) 
	{
		super(firstName, lastName);
	}
}
