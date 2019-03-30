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
 * This class is a panel which allows administrator to select how to interact with a patient.
 */
public class StaffManagePanel
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
		JPanel staffManagement = new JPanel();
		staffManagement.setLayout(null);
		staffManagement.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(StaffManagePanel.class.getResource("/graphics/pNsManagement_background.png")));
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
		 * ADD STAFF BUTTON
		 */
		JButton btnAddS = new JButton("Add a Staff");
		btnAddS.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayAddStaffPage();
			}
		});
		btnAddS.setFont(new Font("Arial", Font.BOLD, 16));
		btnAddS.setBounds(725, 450, 500, 59);
		/*
		 * VIEW PATIENT BUTTON
		 */
		JButton btnView = new JButton("View Staff List");
		btnView.setFont(new Font("Arial", Font.BOLD, 16));
		btnView.setBounds(725, 650, 500, 59);
		btnView.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayStaffListPage();
			}
		});
		/*
		 * VIEW RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayAdminMainPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(55, 950, 169, 59);
		//add all the components to panel
		staffManagement.add(btnReturn);
		staffManagement.add(btnAddS);
		staffManagement.add(btnView);
		staffManagement.add(lblWelcomeBackAdministrator);
		staffManagement.add(date);
		staffManagement.add(lblBackground);
		
		return staffManagement;
	}
}
