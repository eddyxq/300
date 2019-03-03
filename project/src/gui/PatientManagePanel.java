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
public class PatientManagePanel
{
	/**
	 * This method creates and returns a JPanel
	 * @wbp.parser.entryPoint
	 */
	
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	
	public JPanel createPanel(Hospital_Management_System hms)
	{
		JPanel patientManagement = new JPanel();
		patientManagement.setLayout(null);
		patientManagement.setBounds(0, 0, 1920, 1080);

		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back Administrator!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 510, 26);
		
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		
		JButton btnAddP = new JButton("Add a Patient");
		btnAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.addPatientPage();
			}
		});
		btnAddP.setFont(new Font("Arial", Font.BOLD, 16));
		btnAddP.setBounds(725, 360, 500, 59);
			
		JButton btnView = new JButton("View Patient List");
		btnView.setFont(new Font("Arial", Font.BOLD, 16));
		btnView.setBounds(725, 560, 500, 59);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.viewPatient();
			}
		});
		
		JButton btnEdit = new JButton("Edit Patient");
		btnEdit.setFont(new Font("Arial", Font.BOLD, 16));
		btnEdit.setBounds(725, 760, 500, 59);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.adminMainPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(55, 950, 169, 59);
		
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(PatientManagePanel.class.getResource("/graphics/PatientManagement_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		//Adding Components 
		patientManagement.add(btnReturn);
		patientManagement.add(btnAddP);
		patientManagement.add(btnView);
		patientManagement.add(btnEdit);
		patientManagement.add(lblWelcomeBackAdministrator);
		patientManagement.add(date);
		patientManagement.add(lblBackground);
		
		return patientManagement;
	}
}

