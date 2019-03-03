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
 * This class is a panel which allows the patient to view their appointment(s).
 */
public class PatientViewAppointmentPanel
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel patientViewAppointment = new JPanel();
		patientViewAppointment.setLayout(null);
		patientViewAppointment.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(PatientViewAppointmentPanel.class.getResource("/graphics/PatientAppointment_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * HEADER MESSAGE
		 */
		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back PLACEHOLDERNAME!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 1000, 26);
		/*
		 * DATE DISPLAYED BELOW HEADER
		 */
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		/*
		 * APPOINTMENT LABEL
		 */
		JLabel lblAppointment = new JLabel("Your Appointment is at: PLACEHOLDER APPOINTMENT");
		lblAppointment.setFont(bArial);
		lblAppointment.setBounds(574, 533, 1000, 82);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayLoginPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(725, 760, 500, 59);
		//add all the components to panel
		patientViewAppointment.add(lblAppointment);
		patientViewAppointment.add(btnReturn);
		patientViewAppointment.add(lblWelcomeBackAdministrator);
		patientViewAppointment.add(date);
		patientViewAppointment.add(lblBackground);
		
		return patientViewAppointment;
	}
}
