package system;

import java.util.ArrayList;
import javax.swing.JPanel;
import database.TextReader;
import database.TextWriter;
import user.Employee;
import user.Patient;
import gui.*;

/*
 * This class contains the logic for the hospital manage system.
 */
public class Hospital_Management_System 
{
	//list of all the patients in the system
	ArrayList<Patient> patientRecord = new ArrayList<Patient>();
	//list of all the patients in the system
	ArrayList<Employee> employeeRecord = new ArrayList<Employee>();
	//initialize GUI
	private	JPanel addPatientPage = new AddPatientPanel().createPanel(this);
	private JPanel patientManagementPage = new PatientManagePanel().createPanel(this);
	private JPanel staffManagementPage = new StaffManagePanel().createPanel(this);
	private JPanel adminMainPage = new AdminMainPanel().createPanel(this);
	private JPanel employeeMainPage = new EmployeeMainPanel().createPanel(this);
	private JPanel homePage = new HomePanel().createPanel(this);
	private JPanel addAppointmentPage = new AddAppointmentPanel().createPanel(this);
	private PatientListPanel plp = new PatientListPanel();
	private JPanel patientListPage = plp.createPanel(this);
	private EmployeeListPanel slp = new EmployeeListPanel();
	private JPanel staffListPage = slp.createPanel(this);
	private JPanel addStaffPage = new AddStaffPanel().createPanel(this);
	private JPanel loginPage = new LoginPanel().createPanel(this);
	private JPanel calendarPage = new CalendarPanel().createPanel(this);
	private AppointmentListPanel alp = new AppointmentListPanel();
	private JPanel appointmentListPage = alp.createPanel(this);
	private AppointmentListPanelAdmin alap = new AppointmentListPanelAdmin();
	private JPanel appointmentListPageAdmin = alap.createPanel(this);
	private JPanel manageAppointmentPage = new ManageDepartmentPanel().createPanel(this);
	private JPanel addDepartmentPage = new AddDepartmentPanel().createPanel(this);
	
	private String accessFrom;
	private Integer id;
	/**
	 * This constructor starts the system.
	 */
	public Hospital_Management_System()
	{
		//retrieve saved data
		loadData();
		//start user interface
		new GUI(addPatientPage, patientManagementPage, adminMainPage, 
		homePage, addAppointmentPage, patientListPage,
		addStaffPage, staffManagementPage, staffListPage, loginPage, 
		employeeMainPage, calendarPage, appointmentListPage, appointmentListPageAdmin,
		manageAppointmentPage, addDepartmentPage);
		//saves date on exit
		Runtime.getRuntime().addShutdownHook(onExit());
	}
	/**
	 * This method will restore the data saved from text file
	 */
	private void loadData() 
	{
		patientRecord = new TextReader().loadPatientData();
		employeeRecord = new TextReader().loadEmployeeData();
		
		for(Patient p : patientRecord)
		{
			plp.addPatientToTable(p, this);
		}
		for(Employee e : employeeRecord)
		{
			slp.addEmployeeToTable(e, this);
		}
	}
	/**
	 * This method creates and returns a thread that is executed
	 * when the program is closed allowing the system to save
	 * the patient records to a text file on exit
	 */
	private Thread onExit()
	{
		return new Thread() {public void run() 
		{	
			new TextWriter().savePatientData(patientRecord);
			new TextWriter().saveEmployeeData(employeeRecord);
		}};
	}
	/**
	 * This method will run the HMS.
	 */
	public void startHMS() 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {public void run() {}});
		displayHomePage();
		//displayCalendarPage();
	}
	/**
	 * This method will change the gui to display the username and password prompt for staffs
	 */
	public void displayLoginPage()
	{
		hideAll();
		loginPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the admin main page.
	 */
	public void displayAddDepartmentPage() 
	{
		hideAll();
		addDepartmentPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the add department page.
	 */
	public void displayManageDepartmentPage() 
	{
		hideAll();
		manageAppointmentPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the admin main page.
	 */
	public void displayAdminMainPage() 
	{
		hideAll();
		adminMainPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the employee main page.
	 */
	public void displayEmployeeMainPage() 
	{
		hideAll();
		employeeMainPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the employee calendar page.
	 */
	public void displayCalendarPage() 
	{
		hideAll();
		calendarPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the patient management page.
	 */
	public void displayPatientManagementPage() 
	{
		hideAll();
		patientManagementPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the staff management page.
	 */
	public void displayStaffManagementPage() 
	{
		hideAll();
		staffManagementPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the add patient page.
	 */
	public void displayAddPatientPage() 
	{
		hideAll();
		addPatientPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the patient main page.
	 */
	public void displayHomePage() 
	{
		hideAll();
		homePage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the appointment list page.
	 */
	public void displayAppointmentListPage() 
	{
		hideAll();
		appointmentListPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the appointment list page for admin.
	 */
	public void displayAppointmentListPageAdmin() 
	{
		hideAll();
		appointmentListPageAdmin.setVisible(true);
	}
	/**
	 * This method will change the gui to display the patient list page.
	 */
	public void displayPatientListPage() 
	{
		hideAll();
		patientListPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the staff list page.
	 */
	public void displayStaffListPage()
	{
		hideAll();
		staffListPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the add appointment page.
	 */
	public void displayAddAppointmentPage()
	{
		hideAll();
		addAppointmentPage.setVisible(true);
	}
	/**
	 * This method will change the gui to display the add staff page.
	 */
	public void displayAddStaffPage()
	{
		hideAll();
		addStaffPage.setVisible(true);
	}
	/**
	 * This method will add a new patient to the patient records.
	 * @param patient The patient to be added.
	 */
	public void addPatient(Patient patient)
	{
		//assign the next available id number to patient
		patient.setId(patientRecord.size() + 1);
		//add to records
		patientRecord.add(patient);
		plp.addPatientToTable(patient, this);
	}
	/**
	 * This method will add a new patient to the patient records.
	 * @param patient The patient to be added.
	 */
	public void addEmployee(Employee employee)
	{
		//assign the next available id number to patient
		employee.setId(employeeRecord.size() + 1);
		//add to records
		employeeRecord.add(employee);
		slp.addEmployeeToTable(employee, this);
	}
	/**
	 * This method will add an appointment for a patient
	 * @param date The date of the appointment
	 * @param time The time of the appointment
	 */
	public void addAppointment(String date, String time)
	{
		patientRecord.get(getId()-1).setAppointment(date, time);
		alp.addAppointmentToTable(patientRecord.get(getId()-1), this);
		alap.addAppointmentToTable(patientRecord.get(getId()-1), this);
	}
	/**
	 * This method returns the appointment date.
	 * @param id The patient id
	 */
	public String getAppointmentDate(String id)
	{
		return patientRecord.get(Integer.parseInt(id)-1).getAppointmentDate();
	}
	/**
	 * This method returns the appointment time.
	 * @param id The patient id
	 */
	public String getAppointmentTime(String id)
	{
		return patientRecord.get(Integer.parseInt(id)-1).getAppointmentTime();
	}
	/**
	 * This method returns true when patient id is valid
	 * @param id The patient id
	 */
	public boolean patientIdValid(String id)
	{
		return allDigits(id) && (Integer.parseInt(id)) <= patientRecord.size() ? true : false;
	}
	/**
	 * This method checks the inputed string and determines whether it contains only digits
	 * Returns true when string contains all digits, false otherwise
	 * @param s This is the string being checked
	 */
	public boolean allDigits(String s) 
	{
		boolean noDigits = true;
		for (int index = 0; index < s.length(); index++)
		{
			char aChar = s.charAt(index);
			if (!Character.isDigit(aChar))
			{
				noDigits = false;
			}
		}
		return noDigits;
	}
	/**
	 * This method will return the dates and times of patient appointments.
	 * @param currentDay The current day
	 * @param currentMonth The current month
	 * @param currentYear The current year
	 */
	public ArrayList<String> generateDaySchedule(String currentDay, String currentMonth, String currentYear)
	{
		ArrayList<String> appointmentData = new ArrayList<String>();
		String names = "";
		String times = "";
		
		for(Patient p : patientRecord)
		{
			if(!p.getAppointmentDate().contains("UNKNOWN"))
			{
				String[] date = p.getAppointmentDate().split("/");
				String day = date[0];
				String month = date[1];
				String year = date[2];

				if ((day.equals(currentDay)) && (month.equals(currentMonth)) && (year.equals(currentYear)))
				{
					names += p.getFirstName() + " " + p.getLastName() + "<br/>";
					times += p.getAppointmentTime() + "<br/>";
				}
			}
		}
		names = "<html>" + names + "</html>"; 
		times = "<html>" + times + "</html>"; 
		appointmentData.add(names);
		appointmentData.add(times);
		
		return appointmentData;
	}
	/**
	 * This method will hide all the visible panels.
	 */
	private void hideAll()
	{
		addPatientPage.setVisible(false);
		patientManagementPage.setVisible(false);
		staffManagementPage.setVisible(false);
		adminMainPage.setVisible(false);
		employeeMainPage.setVisible(false);
		homePage.setVisible(false);
		addAppointmentPage.setVisible(false);
		patientListPage.setVisible(false);
		staffListPage.setVisible(false);
		addStaffPage.setVisible(false);
		loginPage.setVisible(false);
		calendarPage.setVisible(false);
		appointmentListPage.setVisible(false);
		appointmentListPageAdmin.setVisible(false);
		manageAppointmentPage.setVisible(false);
		addDepartmentPage.setVisible(false);
	}
	/**
	 * This method will return the id.
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * This method set the id.
	 * @param id The ID.
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	/**
	 * This method will return accessFrom.
	 */
	public String getAccessFrom() 
	{
		return accessFrom;
	}
	/**
	 * This method set the id.
	 * @param accessFrom The type of employee that last accessed.
	 */
	public void setAccessFrom(String accessFrom) 
	{
		this.accessFrom = accessFrom;
	}
}
