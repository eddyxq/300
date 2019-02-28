package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import display.TestPanel;
import user.Patient;

/*
 * This class is a panel which allows the patient to view their appointment(s).
 */
public class PatientViewAppointmentPanel
{
	/**
	 * This method creates and returns a JPanel
	 * @wbp.parser.entryPoint
	 */
	
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	
	public JPanel createPanel()
	{
		JPanel patientViewAppointment = new JPanel();
		patientViewAppointment.setLayout(null);
		patientViewAppointment.setBounds(0, 0, 1920, 1080);

		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back PLACEHOLDERNAME!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 1000, 26);
		
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		
		JLabel lblAppointment = new JLabel("Your Appointment is at: PLACEHOLDER APPOINTMENT");
		lblAppointment.setFont(bArial);
		lblAppointment.setBounds(574, 533, 1000, 82);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(725, 760, 500, 59);
		
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/PatientAppointment_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		//Adding Components 
		patientViewAppointment.add(lblAppointment);
		patientViewAppointment.add(btnReturn);
		patientViewAppointment.add(lblWelcomeBackAdministrator);
		patientViewAppointment.add(date);
		patientViewAppointment.add(lblBackground);
		
		return patientViewAppointment;
	}
}

