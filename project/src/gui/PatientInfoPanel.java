package gui;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import system.Hospital_Management_System;
import user.Patient;

/*
 * This class displays the patient info panel.
 */
public class PatientInfoPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);

	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel addPatients = new JPanel();
		addPatients.setLayout(null);
		addPatients.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(PatientInfoPanel.class.getResource("/graphics/AddPatientBackground.png")));
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
		 * FIRST NAME
		 */
		JLabel lbFirstName = new JLabel("First Name: ");
		lbFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbFirstName.setBounds(78, 268, 100, 50);
		/*
		 * Patient's first name
		 */
		JLabel pFirstName = new JLabel("Place Holder First Name");
		pFirstName.setBounds(640, 285, 300, 20);
		pFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/*
		 * LAST NAME
		 */
		JLabel lbLastName = new JLabel("Last Name: ");
		lbLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLastName.setBounds(78, 320, 100, 50);
		/*
		 * Patient's last name
		 */
		JLabel pLastName = new JLabel("Place Holder Last Name");
		pLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pLastName.setBounds(640, 337, 300, 20);
		/*
		 * SEX
		 */
		JLabel lbSex = new JLabel("Sex: ");
		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSex.setBounds(78, 371, 100, 50);
		/*
		 * Patient's sex
		 */
		JLabel pSex = new JLabel("Place Holder Sex");
		pSex.setBounds(640, 387, 100, 23);
		pSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		/*
		 * DOB
		 */
		JLabel lbDOB = new JLabel("Date of birth (dd/mm/yyyy): ");
		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDOB.setBounds(78, 428, 300, 50);
		/*
		 * Patient's DOB
		 */
		JLabel pDob = new JLabel("Place Holder DOB");
		pDob.setBounds(640, 445, 70, 20);
		pDob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/*
		 * PHONE NUMBER
		 */
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(78, 489, 250, 50);
		/*
		 * Patient's Phone Number
		 */
		JLabel pPhoneNum = new JLabel("Place Holder Phone Number");
		pPhoneNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pPhoneNum.setBounds(640, 506, 300, 20);
		/*
		 * EMAIL
		 */
		JLabel lbEmail = new JLabel("E-mail: ");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbEmail.setBounds(78, 548, 250, 50);
		/*
		 * Patient's E-mail
		 */
		JLabel pEmail = new JLabel("Place Holder E-mail");
		pEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pEmail.setBounds(640, 565, 300, 20);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.patientManagementPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(900, 960, 169, 59);
		
		//add all the components to panel
		addPatients.add(lblPhoneNumber);
		addPatients.add(pPhoneNum);
		addPatients.add(lbEmail);
		addPatients.add(pEmail);
		addPatients.add(lbDOB);
		addPatients.add(pDob);
		addPatients.add(lbSex);
		addPatients.add(pSex);
		addPatients.add(lbFirstName);
		addPatients.add(pFirstName);
		addPatients.add(pLastName);
		addPatients.add(lbLastName);
		addPatients.add(btnReturn);
		addPatients.add(lblWelcomeBackAdministrator);
		addPatients.add(date);
		addPatients.add(lblBackground);
		
		return addPatients;
	}
}
