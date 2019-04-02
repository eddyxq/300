package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import system.Hospital_Management_System;

/*
 * This class is a panel which allows administrator to select how to interact with patient/
 * employee records.
 */
public class AdminMainPanel
{
	
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	/**
	 * This method creates and returns a JPanel
	 * @param hms
	 * @return this panel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel adminMain = new JPanel();
		adminMain.setLayout(null);
		adminMain.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AdminMainPanel.class.getResource("/graphics/Admin_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * HEADER MESSAGE
		 */
		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back Administrator!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 510, 26);
		/*
		 * DATE DISPLAYED BELOW HEADER
		 */
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		/*
		 * MANAGE PATIENT RECORDS BUTTON
		 */
		JButton btnManagePatient = new JButton("Manage Patient Records");
		btnManagePatient.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayPatientManagementPage();
			}
		});
		btnManagePatient.setFont(new Font("Arial", Font.BOLD, 16));
		btnManagePatient.setBounds(785, 380, 400, 59);
		/*
		 * MANAGE EMPLOYEE RECORDS BUTTON
		 */
		JButton btnManageEmployee = new JButton("Manage Employee Records");
		btnManageEmployee.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayStaffManagementPage();
			}
		});
		btnManageEmployee.setFont(new Font("Arial", Font.BOLD, 16));
		btnManageEmployee.setBounds(785, 575, 400, 59);
		/*
		 * MANAGE DEPARTMENT BUTTON
		 */
		JButton btnManageDepart = new JButton("Manage Departments");
		btnManageDepart.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				hms.displayManageDepartmentPage();
			}
		});
		btnManageDepart.setFont(new Font("Arial", Font.BOLD, 16));
		btnManageDepart.setBounds(785, 745, 400, 59);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Logout");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				hms.displayHomePage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(785, 930, 400, 59);
		
		//add all the components to panel
		adminMain.add(btnManageDepart);
		adminMain.add(btnManagePatient);
		adminMain.add(btnManageEmployee);
		adminMain.add(btnReturn);
		adminMain.add(lblWelcomeBackAdministrator);
		adminMain.add(date);
		adminMain.add(lblBackground);
		
		return adminMain;
	}
}

