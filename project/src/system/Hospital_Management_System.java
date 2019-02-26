package system;

import java.util.ArrayList;
import java.util.Scanner;

import user.Patient;
import user.Personnel;

public class Hospital_Management_System 
{
	Scanner sc;
	ArrayList<Patient> patientRecord;
	ArrayList<Personnel> employeeRecord;
	String currentPage;
	boolean systemOn;
	String selection;
	
	public Hospital_Management_System()
	{
		//start the system
		systemOn = true;
		//initialize scanner for input
		sc = new Scanner(System.in);
		//this list stores all the patient data
		patientRecord = new ArrayList<Patient>();
		//this list stores all the employee data
		employeeRecord = new ArrayList<Personnel>();
		//set system to start on main page
		currentPage = "Main Menu";
	}
	
	public void start()
	{
		//main loop that keeps the system on
		while (systemOn)
		{
			//main menu 
			if (currentPage == "Main Menu")
			{
				displayMainMenu();
				//let user select options
				switch(askForInput())
				{
					case "1":
						currentPage = "Admin Portal";
						break;
					case "2":
						currentPage = "Patient Portal";
						break;
					case "3":
						currentPage = "Employee Portal";
						break;
					case "0":
						returnToMainMenu();
						break;
				}
			}
			//admin portal
			else if (currentPage == "Admin Portal")
			{
				displayAdminPortal();
				
				switch(askForInput())
				{
					case "1":
						currentPage = "Patient Records";
						break;
					case "2":
						currentPage = "Employee Records";
						break;
					case "0":
						returnToMainMenu();
						break;
				}
			}
			//patient portal
			else if (currentPage == "Patient Portal")
			{
				displayPatientPortal();

				System.out.println("Enter your ID: ");
				int id = Integer.parseInt(askForInput());

				System.out.println("Your next appointment is on " + patientRecord.get(id).appointmentDate + " at " + patientRecord.get(id).appointmentTime);
				returnToMainMenu();
			}
			
			else if (currentPage == "Employee Portal")
			{
				displayEmployeePortal();
				
				switch(askForInput())
				{
					case "1":
						System.out.println("Enter employee ID: ");
						break;
					case "2":
						currentPage = "Employee Records";
						break;
					case "0":
						returnToMainMenu();
						break;
				}
			}
			else if (currentPage == "Patient Records")
			{
				displayPatientManagementMenu();
				
				switch(askForInput())
				{
					case "1":
						addPatient();
						break;
					case "2":
						viewPatient();
						break;
					case "3":
						editPatient();
						break;
				}
		
			}
			else if (currentPage == "Employee Records")
			{
				displayEmployeeManagementMenu();
				
				switch(askForInput())
				{
					case "1":
						addEmployee();
						break;
					case "2":
						viewPatient();
						break;
					case "3":
						editPatient();
						break;
				}
				
			}
			else if (currentPage == "View Appointment")
			{
				
			}
			else if (currentPage == "Cancel Appointment")
			{
				
			}
			
		}
		
	}

	private void returnToMainMenu() 
	{
		currentPage = "Main Menu";
	}

	private void displayPatientManagementMenu() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Add New Patient");
		System.out.println("2. View Patient");
		System.out.println("3. Edit Patient");
		System.out.println("0. Exit");
	}
	
	private void displayEmployeeManagementMenu() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Add New Employee");
		System.out.println("2. View Employee");
		System.out.println("3. Edit Employee");
		System.out.println("0. Exit");
	}

	private void displayEmployeePortal() 
	{
		System.out.println("Select Command:");
		System.out.println("1. View Schedule");
		System.out.println("0. Exit");
	}

	private void displayPatientPortal() 
	{
		System.out.println("Select Command:");
		System.out.println("1. View Appointments");
		System.out.println("2. Cancel An Appointment");
		System.out.println("0. Exit");
	}

	private void displayAdminPortal() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Manage Patient Records");
		System.out.println("2. Manage Employee Records");
		System.out.println("0. Exit");
	}

	private void displayMainMenu() 
	{
		System.out.println("Select user module:");
		System.out.println("1. Admin");
		System.out.println("2. Patient");
		System.out.println("3. Employee");
		System.out.println("0. Exit");
	}

	private String askForInput() 
	{
		return sc.nextLine();
	}

	private void goToEmployeePortal() 
	{
		
	}

	private void goToPatientPortal() 
	{
		
	}

	private void goToAdminPortal() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Patient Details");
		System.out.println("2. Employee Details");
		System.out.println("0. Exit");

		selection = sc.nextLine();
		
		switch(selection)
		{
		case "1":
			accessPatientRecords();
			break;
		case "2":
			accessEmployeeRecords();
			break;		
		}
	}

	private void accessEmployeeRecords() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Add New Employee");
		System.out.println("2. View Employee");
		System.out.println("3. Edit Employee");
		System.out.println("0. Exit");
		
		selection = sc.nextLine();
		
		switch(selection)
		{
		case "1":
			addEmployee();
			break;
		case "2":
			viewEmployee();
			break;		
		case "3":
			editEmployee();
			break;		
		}
	}

	private void addEmployee() 
	{
		
	}

	private void viewEmployee() 
	{
		
	}

	private void editEmployee() 
	{
		
	}

	private void accessPatientRecords() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Add New Patient");
		System.out.println("2. View Patient");
		System.out.println("3. Edit Patient");
		System.out.println("0. Exit");
		
		selection = sc.nextLine();
		
		switch(selection)
		{
		case "1":
			addPatient();
			break;
		case "2":
			viewPatient();
			break;		
		case "3":
			editPatient();
			break;		
		}
	}

	private void editPatient() 
	{
		System.out.println("Select Command:");
		System.out.println("1. Add New Appointment");
		System.out.println("2. Cancel Appointment");
		System.out.println("0. Exit");
		
		
		switch(askForInput())
		{
			case "1":
				System.out.println("Enter Patient ID: ");
				int id = Integer.parseInt(askForInput()) - 1;
				
				System.out.println("Enter Appointment Date");
				String date = askForInput();
				
				System.out.println("Enter Appointment Time");
				String time = askForInput();
				
				patientRecord.get(id).setAppointment(date, time);
				
				currentPage = "Patient Records";
				break;
				
			case "2":
				currentPage = "Employee Records";
		}	
		
	}

	private void viewPatient() 
	{
		System.out.println("ID#\tFirst\tLast");
		
		for (Patient p : patientRecord)
		{
			System.out.println(p.id + "\t" + p.firstName + "\t" + p.lastName + "\n");
		}
		
	}

	private void addPatient()
	{
		System.out.println("Enter Patient's First Name: ");
		String firstName = sc.nextLine(); 
		System.out.println("Enter Patient's Last Name: ");
		String lastName = sc.nextLine();
		int id = patientRecord.size() + 1;
		
		Patient newPatient = new Patient(firstName, lastName, id);
		
		patientRecord.add(newPatient);
	}
}
