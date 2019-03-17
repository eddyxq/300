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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import system.Hospital_Management_System;

/*
 * This class displays the add patient panel.
 */
public class AddAppointmentPanel 
{
	private JTextField tfDate;
	private JTextField tfTime;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel addAppointmentPanel = new JPanel();
		addAppointmentPanel.setLayout(null);
		addAppointmentPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AddAppointmentPanel.class.getResource("/graphics/list_background.png")));
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
		 * DATE
		 */
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		lblDate.setBounds(959, 339, 46, 14);
		/*
		 * Text Field for Appointment Date
		 */
		tfDate = new JTextField();
		tfDate.setBounds(879, 364, 200, 20);
		tfDate.setColumns(10);
		/*
		 * TIME
		 */
		JLabel lbTime = new JLabel("Time:");
		lbTime.setFont(new Font("Arial", Font.BOLD, 16));
		lbTime.setBounds(959, 453, 46, 14);
		/*
		 * Text Field for Appointment Time
		 */
		tfTime = new JTextField();
		tfTime.setColumns(10);
		tfTime.setBounds(879, 478, 200, 20);
		/*
		 * CANCEL BUTTON
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				clearTextField();
				hms.displayPatientManagementPage();
			}
		});
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancel.setBounds(1400, 950, 169, 59);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(370, 950, 169, 59);
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.addAppointment(tfDate.getText(), tfTime.getText());
				//display confirmation message
				Object[] options = {"Ok"};
				JOptionPane.showOptionDialog(null, "Appointment added.", "Success",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, options, options[0]);
				//go back to previous menu
				clearTextField();
				hms.displayPatientListPage();
			}
		});
		
		
		addAppointmentPanel.add(lblDate);
		addAppointmentPanel.add(tfDate);
		addAppointmentPanel.add(lbTime);
		addAppointmentPanel.add(tfTime);
		addAppointmentPanel.add(btnSubmit);
		addAppointmentPanel.add(btnCancel);
		addAppointmentPanel.add(lblWelcomeBackAdministrator);
		addAppointmentPanel.add(date);
		addAppointmentPanel.add(lblBackground);
		
		return addAppointmentPanel;
	}
	/**
	 * This method resets all the text fields
	 */
	private void clearTextField() 
	{
		tfDate.setText("");
		tfTime.setText("");
	}
}
