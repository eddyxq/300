package user;

public abstract class Person 
{
	public String firstName;
	public String lastName;
	public int age;
	public String phoneNum;
	public int[] gender = new int[3];
	
	public Person(String firstName, String lastName, int age, String phoneNum)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	
}
