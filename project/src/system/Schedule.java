package system;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.lang.Math;

import user.Employee;
import user.Patient;

public class Schedule {
	
	
	ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	ArrayList<Appointment> sortedListPatient = new ArrayList<Appointment>();
	ArrayList<Appointment> sortedListEmployee = new ArrayList<Appointment>();
	
	
	Schedule(){
		
		
	}
	
	//create an appointment and store it in the list
	void CreateAppointment(Date d, Patient p, Employee e) {
		Appointment nAppointment = new Appointment(d,p,e);
		
		appointmentList.add(nAppointment);
		
		sortedListPatient.add(nAppointment);
		sortSortedListPatient();
		
		sortedListEmployee.add(nAppointment);
		sortSortedListEmployee();
		
	}
	
	
	//uses binary tree search to find a list of appointments for the patient
	ArrayList<Appointment> findPatientAppointments(int ID){
		ArrayList<Appointment> aList = new ArrayList<Appointment>();
		
		int low = 0;
		int high = sortedListPatient.size() -1;
		int index = high / 2;
		
		while (low <= high){
			Appointment a = sortedListPatient.get(index);
			Patient p = a.getPatient();
			if (p.getID() == ID) {
				for(int i = index; i <= high; i ++) {
					if(sortedListPatient.get(i).getPatient().getID() == ID) {
						aList.add(sortedListPatient.get(i));
					}else {
						break;
					}
				}
				for(int i = index - 1; i <= high; i --) {
					if(sortedListPatient.get(i).getPatient().getID() == ID) {
						aList.add(sortedListPatient.get(i));
					}else {
						break;
					}
				}
				return aList;
				
			}else if (p.getID() < ID) {
				low = index + 1;
			}else {
				high = index -1;
			}
			index = (low + high)/ 2;
		}
		
		return aList;
	}
	
	//uses binary tree search to find a list of appointments for the employee
	ArrayList<Appointment> findEmployeeAppointments(int ID){
		ArrayList<Appointment> aList = new ArrayList<Appointment>();
		
		int low = 0;
		int high = sortedListEmployee.size() -1;
		int index = high / 2;
		
		while (low <= high){
			Appointment a = sortedListEmployee.get(index);
			Patient p = a.getPatient();
			if (p.getID() == ID) {
				for(int i = index; i <= high; i ++) {
					if(sortedListEmployee.get(i).getPatient().getID() == ID) {
						aList.add(sortedListEmployee.get(i));
					}else {
						break;
					}
				}
				for(int i = index - 1; i <= high; i --) {
					if(sortedListEmployee.get(i).getPatient().getID() == ID) {
						aList.add(sortedListEmployee.get(i));
					}else {
						break;
					}
				}
				return aList;
				
			}else if (p.getID() < ID) {
				low = index + 1;
			}else {
				high = index -1;
			}
			index = (low + high)/ 2;
		}
		
		return aList;
	}
	
	
	//sorts the last element in the list to the appropriate location
	private void sortSortedListPatient() {
		Appointment addedAppointment = sortedListPatient.get(sortedListPatient.size()-1);
		for (int index = sortedListPatient.size()-2; index >= 0; index --) {
			Appointment mAppointment = sortedListPatient.get(index);
			if (mAppointment.getPatient().getID() <= addedAppointment.getPatient().getID()) {
				sortedListPatient.set(index + 1, addedAppointment);
				break;
			}else {
				sortedListPatient.set(index + 1, mAppointment);
			}
			if(index == 0) {
				sortedListPatient.set(index, addedAppointment);
			}
		}
	}
	
	
	//sorts the last element in the list to the appropriate location
	private void sortSortedListEmployee() {
		Appointment addedAppointment = sortedListEmployee.get(sortedListEmployee.size()-1);
		for (int index = sortedListEmployee.size()-2; index >= 0; index --) {
			Appointment mAppointment = sortedListEmployee.get(index);
			if (mAppointment.getEmployee().getID() <= addedAppointment.getEmployee().getID()) {
				sortedListEmployee.set(index + 1, addedAppointment);
				break;
			}else {
				sortedListEmployee.set(index + 1, mAppointment);
			}
			if(index == 0) {
				sortedListEmployee.set(index, addedAppointment);
			}
		}
	}
	
	
	//changes the status of the closest Appointment to be checked in
	//returns true if successful
	//returns false if the patient has no appointment or is already checked in to an appointment
	boolean checkIn(int pID) {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; //Months start at 0
		int thisDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int thisTime = Calendar.getInstance().get(Calendar.HOUR);
		
		
		
		ArrayList<Appointment> app = findPatientAppointments(pID);
		try {
			Appointment closest = app.get(0);
		
		
		for (int index = 0; index < app.size(); index ++) {
			Appointment current = app.get(index);
			Date d = current.getDate();
			if (current.getCheckIn()) {
				return false;
			}
			if (d.getYear() == thisYear && d.getMonth() == thisMonth && d.getDay() == thisDay) {
				
				if (Math.abs(closest.getDate().getTime() - thisTime) > Math.abs(d.getTime() - thisTime)  ) {
					closest = current;
				}
			}
		}
		
		closest.checkIn();
		return true;
		
		}catch (IndexOutOfBoundsException iobe) {
			return false;
		}
		
		
	}
	
	//checks out all of patients appointments
	void checkOut(int pID) {
		ArrayList<Appointment> app = findPatientAppointments(pID);
		for (int index = 0; index < app.size(); index ++) {
			app.get(index).checkOut();
		}
	}
	
	//counts the number of appointments in a department
	int getNumDep(String department) {
		int num = 0;
		for (int index = 0; index < appointmentList.size(); index ++) {
			if (appointmentList.get(index).getDepartment() == department) {
				num ++;
			}
		}
		
		return num;
	}
	
	//counts the number of appointments of a type
	int getNumType(String type) {
		int num = 0;
		for (int index = 0; index < appointmentList.size(); index ++) {
			if (appointmentList.get(index).getType() == type) {
				num ++;
			}
		}
		return num;
	}
}
