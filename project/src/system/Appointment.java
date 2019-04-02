package system;

import user.Employee;
import user.Patient;

public class Appointment {
	private String id;
	private Patient patient;
	private String patientName;
	private String doctor;
	private String time;
	private String date;
	
	public Appointment(String id, String patientName, String doctor, String date, String time) {
		this.id = id;
		this.patientName = patientName;
		this.doctor = doctor;
		this.date = date;
		this.time = time;
	}
	
	public Appointment(Patient patient) {
		this.patient = patient;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public String getDocName() {
		return doctor;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getDate() {
		return date;
	}
}
