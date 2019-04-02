package system;

import user.Employee;
import user.Patient;

public class Appointment {
	private String id;
	private String patientName;
	private String docFName;
	private String docLName;
	private String time;
	private String date;
	
	public Appointment(String id, String patientName, String doc, String date, String time) {
		this.id = id;
		this.patientName = patientName;
		String[] docName = doc.split(" ");
		this.docFName = docName[0];
		this.docLName = docName[1];
		this.date = date;
		this.time = time;
	}
	public String getPName() {
		return patientName;
	}
	
	public String getDocName() {
		return docFName+" "+docLName;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getID() {
		return id;
	}
}
