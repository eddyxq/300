package system;
/*
 * This class defines the the appointments a patient can schedule.
 */
public class Appointment 
{
	private String id;
	private String patientName;
	private String docFName;
	private String docLName;
	private String time;
	private String date;
	private Boolean isCheckedIn;
	/*
	 * This Constructor will initialize the Appointment fields.
	 */
	public Appointment(String id, String patientName, String doc, String date, String time) 
	{
		this.id = id;
		this.patientName = patientName;
		String[] docName = doc.split(" ");
		this.docFName = docName[0];
		this.docLName = docName[1];
		this.date = date;
		this.time = time;
		this.isCheckedIn = false;
	}
	/**
	 * This method returns the patient's name.
	 */
	public String getPName() 
	{
		return patientName;
	}
	/**
	 * This method returns the doctor's name.
	 */
	public String getDocName() 
	{
		return docFName+" "+docLName;
	}
	/**
	 * This method returns the doctor's name concatenated without a space.
	 */
	public String getDocNameNoSpace() 
	{
		return docFName+docLName;
	}
	/**
	 * This method returns the time of the appointment.
	 */
	public String getTime() 
	{
		return time;
	}
	/**
	 * This method returns the date of the appointment.
	 */
	public String getDate() 
	{
		return date;
	}
	/**
	 * This method returns the id.
	 */
	public String getID() 
	{
		return id;
	}
	/**
	 * This method returns the check in status of the appointment.
	 */
	public Boolean getCheckInStatus() {
		return isCheckedIn;
	}
	/**
	 * This method sets the appointment as checked in.
	 */
	public void checkIn() {
		isCheckedIn = true;
	}
	/**
	 * This method sets the appointment as checked out.
	 */
	public void checkOut() {
		isCheckedIn = false;
	}
}
