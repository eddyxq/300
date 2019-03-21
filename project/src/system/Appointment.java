package system;

import java.util.Date;
import user.Employee;
import user.Patient;

class Appointment {

	
	
	private Date date;
	private Patient patient;
	private Employee employee;
	private String department;
	private String type;
	
	private Boolean checkedIn = false;
	
	Appointment(Date d, Patient p, Employee e){
		date = d;
		patient = p;
		employee = e;
	}
	
	Appointment(Date d, Patient p, Employee e, String dep, String t){
		date = d;
		patient = p;
		employee = e;
		department  = dep;
		type = t;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	void checkIn() {
		checkedIn = true;
	}
	
	void checkOut() {
		checkedIn = false;
	}
	
	public Boolean getCheckIn() {
		return checkedIn;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getType() {
		return type;
	}
	
}
