package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import system.Hospital_Management_System;
import testing.TestPanel;

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
		JLabel lblAdminIcon = new JLabel(" ");
		lblAdminIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/admin_icon.png")));
		lblAdminIcon.setBounds(398, 466, 380, 380);
		
		JLabel lbStaffIcon = new JLabel(" ");
		lbStaffIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/staff_icon.png")));
		lbStaffIcon.setBounds(1131, 466, 380, 380);
		
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
		btnAdmin.setBounds(485, 885, 211, 111);
		/*
		 * EMPLOYEE BUTTON 
		 */
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.setFont(bArial);
		btnEmployee.setBounds(1230, 885, 211, 111);
		//add all the components to panel
		loginPanel.add(lbStaffIcon);
		loginPanel.add(lblAdminIcon);
		loginPanel.add(btnEmployee);
		loginPanel.add(btnAdmin);
		loginPanel.add(lblBackground);
		
		return loginPanel;
	}
}
