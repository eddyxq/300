package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import system.Hospital_Management_System;

/*
 * This class is a panel which allows the patient to view their appointment(s).
 */
public class HomePanel
{
	private JTextField tfpatientId;
	
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
		lblBackground.setIcon(new ImageIcon(HomePanel.class.getResource("/graphics/patientID_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * PATIENT ID
		 */
		tfpatientId = new JTextField();
		tfpatientId.setFont(new Font("Tahoma", Font.PLAIN, 22));
		tfpatientId.setBounds(711, 466, 500, 50);
		tfpatientId.setColumns(10);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (hms.patientIdValid(tfpatientId.getText()))
				{
					//display appointment time
					Object[] options = {"Ok"};
					JOptionPane.showOptionDialog(null, "You have an appointment on " + 
					hms.getAppointmentDate(tfpatientId.getText()) + " at " +
					hms.getAppointmentTime(tfpatientId.getText()) + ".", "Notice",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, options, options[0]);
				}
				else
				{
					Object[] options = {"Close"};
					JOptionPane.showOptionDialog(null, "Invalid ID.", "Warning",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
					null, options, options[0]);
				}
				tfClearing();
			}
		});
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(830, 660, 250, 59);
		/*
		 * BUTTON - EMPLOYEE LOGIN
		 */
		JButton btnAdminStaffLogin = new JButton("Click here to login");
		btnAdminStaffLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayLoginPage();
				tfClearing();
			}
		});
		btnAdminStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdminStaffLogin.setBounds(1010, 927, 225, 71);
		//add all the components to panel
		patientViewAppointment.add(btnAdminStaffLogin);
		patientViewAppointment.add(btnSubmit);
		patientViewAppointment.add(tfpatientId);
		patientViewAppointment.add(lblBackground);
		
		return patientViewAppointment;
	}
	private void tfClearing() 
	{
		tfpatientId.setText("");
	}
}
