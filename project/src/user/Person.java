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
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
