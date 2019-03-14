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
				hms.displayUsernameNPasswordPageAdmin();
			}
		});
		btnAdmin.setFont(bArial);
		btnAdmin.setBounds(485, 885, 211, 111);
		/*
		 * EMPLOYEE BUTTON 
		 */
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayUsernameNPasswordPageStaff();
			}
		});
		btnEmployee.setFont(bArial);
		btnEmployee.setBounds(1230, 885, 211, 111);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				hms.displayViewAppointmentPage();
			}
		});
		btnReturn.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/return_icon.png")));
		btnReturn.setBounds(50, 900, 107, 99);
		//add all the components to panel
		loginPanel.add(btnReturn);
		loginPanel.add(lbStaffIcon);
		loginPanel.add(lblAdminIcon);
		loginPanel.add(btnEmployee);
		loginPanel.add(btnAdmin);
		loginPanel.add(lblBackground);
		
		return loginPanel;
	}
}
