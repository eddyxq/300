package system;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;

import user.Patient;
import user.Personnel;
import display.ConfirmationMessages;
import display.ErrorMessages;
import display.MenuDisplay;
import gui.TestPanel;
import gui.AddPatientPanel;
import gui.Gui;
import gui.LoginPanel;
import gui.PatientManagePanel;

public class Hospital_Management_System 
{
	Scanner sc;
	ArrayList<Patient> patientRecord;
	ArrayList<Personnel> employeeRecord;
	String currentPage;
	boolean systemOn;
	String selection;
	MenuDisplay menu = new MenuDisplay();
	ErrorMessages error = new ErrorMessages();
	ConfirmationMessages confirm = new ConfirmationMessages();
	
	//initialize GUI
	private	LoginPanel loginPanel = new LoginPanel();
	private	AddPatientPanel addPatientPanel = new AddPatientPanel();
	private PatientManagePanel patientManagementPanel = new PatientManagePanel();
	
	private	JPanel loginP = loginPanel.createPanel();
	private	JPanel addPP = addPatientPanel.createPanel();
	private JPanel pmP = patientManagementPanel.createPanel();
	
	public Hospital_Management_System()
	{
		
		
		Gui gui = new Gui(pmP);
		
		
		
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
				menu.displayAdminPortal();
				
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
				System.out.println("Enter your ID to view your appointment(s): ");
				int id = Integer.parseInt(askForInput());
				
				try {
					if(patientRecord.get(id-1).hasAppointment() == true) {
						System.out.println("\nYour next appointment is on " + patientRecord.get(id-1).getAppointment());
					}else {
						error.displayNoAppointment();
					}
					
				}catch(IndexOutOfBoundsException e){
					error.displayInvalidID();
				}	
				returnToMainMenu();
			}
			
			else if (currentPage == "Employee Portal")
			{
				menu.displayEmployeePortal();
				
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
				menu.displayPatientManagementMenu();
				
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
					case "0":
						returnToAdminPortal();
						break;
				}
		
			}
			else if (currentPage == "Employee Records")
			{
				menu.displayEmployeeManagementMenu();
				
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
					case "0":
						returnToAdminPortal();
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
/*
 * Cancellation Options
 */
	
	private void returnToMainMenu() 
	{
		currentPage = "Main Menu";
	}
	
	private void returnToAdminPortal() {
		currentPage = "Admin Portal";
	}
	
	private void returnToPatientPortal() {
		currentPage = "Patient Portal";
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
		menu.displayDetailSelections();

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
		menu.displayEmployeeManagementMenu();
		
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
/*
 * Record Settings
 */
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
		menu.displayPatientManagementMenu();
		
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
		menu.displayPatientAppointmentSetting();
		
		switch(askForInput())
		{
			case "1":
				System.out.println("Enter Patient ID: ");
				int id = Integer.parseInt(askForInput()) - 1;
				
				System.out.println("Enter Appointment Date (Format: MM/dd/yyyy)");
				String date = askForInput();
				
				
				
				System.out.println("Enter Appointment Time (Format[24hour]: HH:mm)");
				String time = askForInput();
				
			
			//Displays an error message if ID entered was invalid.
			try {
				patientRecord.get(id).setAppointment(date, time);
				confirm.addedPatientAppointments();
			}catch(IndexOutOfBoundsException e){
					error.displayInvalidID();
			}
			
				currentPage = "Patient Records";
				break;
				
			case "2":
				System.out.println("Enter Patient ID: ");
				id = Integer.parseInt(askForInput()) - 1;
				
				currentPage = "Employee Records";
		}	
		
	}

	private void viewPatient() 
	{
		System.out.println("ID#\tFirst Name\tLast Name");
		System.out.println("==================================");
		
		if (patientRecord.size() == 0) {
			//Displays an error message for when there's no patient record.
			error.displayNoPatient();
		}else {
			for (Patient p : patientRecord)
			{
				System.out.println(p.getID() + "\t" + p.firstName + "\t" + p.lastName);
			}
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
		confirm.addedPatient();
	}
}
