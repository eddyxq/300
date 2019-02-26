package user;

public class Patient extends Person
{
	public int id;
	public String appointmentDate;
	public String appointmentTime;
	
	public Patient(String firstName, String lastName, int id) 
	{
		super(firstName, lastName);
		this.id = id;
	}
	
	public void setAppointment(String date, String time)
	{
		appointmentDate = date;
		appointmentTime = time;
	}
}
