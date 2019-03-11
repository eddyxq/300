package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import system.Hospital_Management_System;

public class LoginPanel
{
	/*
	 * This class is a panel which allows the user to login to the system.
	 */
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(LoginPanel.class.getResource("/graphics/login_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * ADMIN BUTTON
		 */
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayAdminMainPage();
			}
		});
		btnAdmin.setFont(bArial);
		btnAdmin.setBounds(240, 847, 211, 111);
		/*
		 * PATIENT BUTTON
		 */
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayViewAppointmentPage();
			}
		});
		btnPatient.setFont(bArial);
		btnPatient.setBounds(1480, 847, 211, 111);
		/*
		 * EMPLOYEE BUTTON 
		 */
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setFont(bArial);
		btnEmployee.setBounds(870, 847, 211, 111);
		//add all the components to panel
		loginPanel.add(btnEmployee);
		loginPanel.add(btnAdmin);
		loginPanel.add(btnPatient);
		loginPanel.add(lblBackground);
		
		return loginPanel;
	}
}
