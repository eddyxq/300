package unitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import gui.*;
import system.Hospital_Management_System;

//JUnit Tests for testing if panel classes are returned properly.
public class JUnit_Panels {
	
	// Create new instance of hms for all the panel tests.
	Hospital_Management_System hms = new Hospital_Management_System();
	
	// Create new instance of AddAppointmentPanel for its test.
	AddAppointmentPanel aap = new AddAppointmentPanel();
	@Test	// Testing the panel for AddAppointmentPanel is returned properly.
	public void addAppointmentPanelReturned() {
		assertNotNull("The panel for AddAppointmentPanel should be returned.", aap.createPanel(hms));
	}
	
	// Create new instance of AddDepartmentPanel for its test.
	AddDepartmentPanel adp = new AddDepartmentPanel();
	@Test	// Testing the panel for AddDepartmentPanel is returned properly.
	public void addDepartmentPanelReturned() {
		assertNotNull("The panel for AddDepartmentPanel should be returned.", adp.createPanel(hms));
	}
	
	// Create new instance of AddPatientPanel for its test.
	AddPatientPanel app = new AddPatientPanel();
	@Test	// Testing the panel for AddPatientPanel is returned properly.
	public void addPatientPanelReturned() {
		assertNotNull("The panel for AddPatientPanel should be returned.", app.createPanel(hms));
	}
	
	// Create new instance of AddStaffPanel for its test.
	AddStaffPanel asp = new AddStaffPanel();
	@Test	// Testing the panel for AddStaffPanel is returned properly.
	public void addStaffPanelReturned() {
		assertNotNull("The panel for AddStaffPanel should be returned.", asp.createPanel(hms));
	}
	
	// Create new instance of AdminMainPanel for its test.
	AdminMainPanel amp = new AdminMainPanel();
	@Test	// Testing the panel for AdminMainPanel is returned properly.
	public void adminMainPanelReturned() {
		assertNotNull("The panel for AdminMainPanel should be returned.", amp.createPanel(hms));
	}
	
	// Create new instance of AppointmentListPanel for its test.
	AppointmentListPanel alp = new AppointmentListPanel();
	@Test	// Testing the panel for AppointmentListPanel is returned properly.
	public void appointmentListPanelReturned() {
		assertNotNull("The panel for AppointmentListPanel should be returned.", alp.createPanel(hms));
	}
	
	// Create new instance of AppointmentListPanelAdmin for its test.
	AppointmentListPanelAdmin alpa = new AppointmentListPanelAdmin();
	@Test	// Testing the panel for AppointmentListPanelAdmin is returned properly.
	public void appointmentListPanelAdminReturned() {
		assertNotNull("The panel for AppointmentListPanelAdmin should be returned.", alpa.createPanel(hms));
	}
	
	// Create new instance of AprilCalendarPanel for its test.
	AprilCalendarPanel acp = new AprilCalendarPanel();
	@Test	// Testing the panel for AprilCalendarPanel is returned properly.
	public void aprilCalendarPanelReturned() {
		assertNotNull("The panel for AprilCalendarPanel should be returned.", acp.createPanel(hms));
	}
	
	// Create new instance of DepartmentStatisticsPanel for its test.
	DepartmentStatisticsPanel dsp = new DepartmentStatisticsPanel();
	@Test	// Testing the panel for DepartmentStatisticsPanel is returned properly.
	public void departmentStatsPanelReturned() {
		assertNotNull("The panel for DepartmentStatisticsPanel should be returned.", dsp.createPanel(hms));
	}
	
	// Create new instance of EditAppointmentPanel for its test.
	EditAppointmentPanel eap = new EditAppointmentPanel();
	@Test	// Testing the panel for EditAppointmentPanel is returned properly.
	public void editAppointmentPanelReturned() {
		assertNotNull("The panel for EditAppointmentPanel should be returned.", eap.createPanel(hms));
	}
	
	// Create new instance of EmployeeListPanel for its test.
	EmployeeListPanel elp = new EmployeeListPanel();
	@Test	// Testing the panel for EmployeeListPanel is returned properly.
	public void employeeListPanelReturned() {
		assertNotNull("The panel for EmployeeListPanel should be returned.", elp.createPanel(hms));
	}
	
	// Create new instance of EmployeeMainPanel for its test.
	EmployeeMainPanel emp = new EmployeeMainPanel();
	@Test	// Testing the panel for EmployeeMainPanel is returned properly.
	public void employeeMainPanelReturned() {
		assertNotNull("The panel for EmployeeMainPanel should be returned.", emp.createPanel(hms));
	}
	
	// Create new instance of HomePanel for its test.
	HomePanel hp = new HomePanel();
	@Test	// Testing the panel for HomePanel is returned properly.
	public void homePanelReturned() {
		assertNotNull("The panel for HomePanel should be returned.", hp.createPanel(hms));
	}
	
	// Create new instance of LoginPanel for its test.
	LoginPanel lp = new LoginPanel();
	@Test	// Testing the panel for LoginPanel is returned properly.
	public void loginPanelReturned() {
		assertNotNull("The panel for LoginPanel should be returned.", lp.createPanel(hms));
	}
	
	// Create new instance of ManageDepartmentPanel for its test.
	ManageDepartmentPanel mdp = new ManageDepartmentPanel();
	@Test	// Testing the panel for ManageDepartmentPanel is returned properly.
	public void manageDepartmentPanelReturned() {
		assertNotNull("The panel for ManageDepartmentPanel should be returned.", mdp.createPanel(hms));
	}
	
	// Create new instance of MayCalendarPanel for its test.
	MayCalendarPanel mcp = new MayCalendarPanel();
	@Test	// Testing the panel for MayCalendarPanel is returned properly.
	public void mayCalendarPanelReturned() {
		assertNotNull("The panel for MayCalendarPanel should be returned.", mcp.createPanel(hms));
	}
	// Create new instance of PatientCheckInAndOutPanel for its test.
	PatientCheckInAndOutPanel pciop = new PatientCheckInAndOutPanel();
	@Test	// Testing the panel for PatientCheckInAndOutPanel is returned properly.
	public void PatientCheckInNOutPanelReturned() {
		assertNotNull("The panel for PatientCheckInAndOutPanel should be returned.", pciop.createPanel(hms));
	}
	
	// Create new instance of PatientListPanel for its test.
	PatientListPanel plp = new PatientListPanel();
	@Test// Testing the panel for PatientListPanel is returned properly.
	public void patientListPanelReturned() {
		assertNotNull("The panel for PatientListPanel should be returned.", plp.createPanel(hms));
	}
	// Create new instance of PatientManagePanel for its test.
	PatientManagePanel pmp = new PatientManagePanel();
	@Test	// Testing the panel for PatientManagePanel is returned properly.
	public void patientManagePanelReturned() {
		assertNotNull("The panel for PatientManagePanel should be returned.", pmp.createPanel(hms));
	}
	
	// Create new instance of StaffManagePanel for its test.
	StaffManagePanel smp = new StaffManagePanel();
	@Test	// Testing the panel for StaffManagePanel is returned properly.
	public void staffManagePanelReturned() {
		assertNotNull("The panel for StaffManagePanel should be returned.", smp.createPanel(hms));
	}
	
}
