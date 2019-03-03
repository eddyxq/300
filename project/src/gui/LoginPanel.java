package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import system.Hospital_Management_System;

public class LoginPanel{
	/*
	 * This class is a panel which allows the user to login to the system.
	 */
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private String btnPressed;
	
	
	public JPanel createPanel(Hospital_Management_System hms)
	{
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		loginPanel.setBounds(0, 0, 1920, 1080);
		
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(LoginPanel.class.getResource("/graphics/login_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.adminMainPage();
			}
		});
		btnAdmin.setFont(bArial);
		btnAdmin.setBounds(500, 847, 211, 111);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.patientMainPage();
			}
		});
		btnPatient.setFont(bArial);
		btnPatient.setBounds(1137, 847, 211, 111);
		
		//Adding Components 
		loginPanel.add(btnAdmin);
		loginPanel.add(btnPatient);
		loginPanel.add(lblBackground);
		
		return loginPanel;
	}
	
	public String getInput() {
		return btnPressed;
	}
	
	private void setInput(String input) {
		btnPressed = input;
	}
	
}
