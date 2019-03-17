package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * This class is the graphical user interface for the system.
 */
public class GUI extends JFrame 
{
	private static final long serialVersionUID = 1L;

	/**
     * This constructor accepts as arguments the other panels and 
     * initializes the frame
     */
    public GUI(JPanel addPatientPanel, JPanel patientManagementPage, JPanel adminMainPanel, 
    		   JPanel homePagePanel, JPanel patientInfoPanel, JPanel addAppointmentPanel, 
    		   JPanel patientListPanel, JPanel addStaffPanel, JPanel staffManagementPanel, 
    		   JPanel staffListPanel, JPanel loginPanel, JPanel staffAppointmentListPanel,
    		   JPanel employeeMainPanel)
    {
    	JFrame window = new JFrame();
        window.setTitle("HMS");
        window.setResizable(true);
        window.setSize(1920, 1080);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add panels
        window.getContentPane().add(addPatientPanel);
        window.getContentPane().add(patientManagementPage);
        window.getContentPane().add(adminMainPanel);
        window.getContentPane().add(homePagePanel);
        window.getContentPane().add(patientInfoPanel);
        window.getContentPane().add(addAppointmentPanel);
        window.getContentPane().add(patientListPanel);
        window.getContentPane().add(addStaffPanel);
        window.getContentPane().add(staffManagementPanel);
        window.getContentPane().add(staffListPanel);
        window.getContentPane().add(loginPanel);
        window.getContentPane().add(staffAppointmentListPanel);
        window.getContentPane().add(employeeMainPanel);
        //set visibility
        addPatientPanel.setVisible(false);
        patientManagementPage.setVisible(false);
        adminMainPanel.setVisible(false);
        homePagePanel.setVisible(false);
        patientInfoPanel.setVisible(false);
        addAppointmentPanel.setVisible(false);
        patientListPanel.setVisible(false);
        addStaffPanel.setVisible(false);
        staffManagementPanel.setVisible(false);
        staffListPanel.setVisible(false);
        loginPanel.setVisible(false);
        staffAppointmentListPanel.setVisible(false);
        employeeMainPanel.setVisible(false);
        //if want to start Full-Screen uncomment below
		//window.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//window.setUndecorated(true);    
        
        window.setVisible(true);
    }
}
     