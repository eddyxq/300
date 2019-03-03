package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import system.Hospital_Management_System;
import user.Patient;

/*
 * This class displays the add patient panel.
 */
public class AddPatientPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private Color bgColor = new Color(215,215,215);
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JTextField tfDay;
	private JTextField tfMonth;
	private JTextField tfYear;
	private JTextField tfPhoneNum;
	private JTextField tfEmail;

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
		lblBackground.setIcon(new ImageIcon(AddPatientPanel.class.getResource("/graphics/AddPatientBackground.png")));
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
		tfFirstName = new JTextField();
		tfFirstName.setBounds(640, 285, 300, 20);
		tfFirstName.setColumns(10);
		/*
		 * LAST NAME
		 */
		JLabel lbLastName = new JLabel("Last Name: ");
		lbLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLastName.setBounds(78, 320, 100, 50);
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(640, 337, 300, 20);
		/*
		 * SEX
		 */
		JLabel lbSex = new JLabel("Sex: ");
		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSex.setBounds(78, 371, 100, 50);
		//male button
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(bgColor);
		rdbtnMale.setBounds(640, 387, 100, 23);
		//female button
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(bgColor);
		rdbtnFemale.setBounds(748, 387, 100, 23);
		//ensures at most one button can be selected
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		/*
		 * DOB
		 */
		JLabel slash = new JLabel("/");
		slash.setBounds(728, 448, 24, 14);
		JLabel label = new JLabel("/");
		label.setBounds(834, 448, 24, 14);
		JLabel lbDOB = new JLabel("Date of birth (dd/mm/yyyy): ");
		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDOB.setBounds(78, 428, 300, 50);
		//day
		tfDay = new JTextField();
		tfDay.addFocusListener(new FocusAdapter() 
		{
			@Override
			public void focusGained(FocusEvent e) 
			{
				tfDay.setText("");
			}
		});
		tfDay.setText("Day");
		tfDay.setBounds(640, 445, 70, 20);
		tfDay.setColumns(10);
		//month
		tfMonth = new JTextField();
		tfMonth.setText("Month");
		tfMonth.setColumns(10);
		tfMonth.setBounds(754, 445, 70, 20);
		tfMonth.addFocusListener(new FocusAdapter() 
		{
			@Override
			public void focusGained(FocusEvent e) 
			{
				tfMonth.setText("");
			}
		});
		//year
		tfYear = new JTextField();
		tfYear.setText("Year");
		tfYear.setColumns(10);
		tfYear.setBounds(856, 445, 70, 20);
		tfYear.addFocusListener(new FocusAdapter() 
		{
			@Override
			public void focusGained(FocusEvent e) 
			{
				tfYear.setText("");
			}
		});
		/*
		 * PHONE NUMBER
		 */
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(78, 489, 250, 50);
		tfPhoneNum = new JTextField();
		tfPhoneNum.setColumns(10);
		tfPhoneNum.setBounds(640, 506, 300, 20);
		/*
		 * EMAIL
		 */
		JLabel lbEmail = new JLabel("E-mail: ");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbEmail.setBounds(78, 548, 250, 50);
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(640, 565, 300, 20);
		/*
		 * CANCEL BUTTON
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				clearTextField();
				hms.patientManagementPage();
			}
		});
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancel.setBounds(1400, 960, 169, 59);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(370, 960, 169, 59);
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//ensure all fields are filled out
				if(formComplete() && (rdbtnMale.isSelected() || rdbtnFemale.isSelected()))
				{
					hms.addPatient(new Patient(tfFirstName.getText(), tfLastName.getText(), 
					(rdbtnMale.isSelected() ? "Male" : "Female"), 
					tfDay.getText()+ "/" + tfMonth.getText() + "/" + tfYear.getText(),
					tfPhoneNum.getText(), tfEmail.getText()));
					
					clearTextField();
					
					hms.patientManagementPage();
				}
				//display warning message if any fields are empty 
				else
				{
					Object[] options = {"Close"};
					JOptionPane.showOptionDialog(null, "Please fill in all information.", "Warning",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
					null, options, options[0]);
				}
			}
		});
		//add all the components to panel
		addPatients.add(lblPhoneNumber);
		addPatients.add(tfPhoneNum);
		addPatients.add(lbEmail);
		addPatients.add(tfEmail);
		addPatients.add(slash);
		addPatients.add(label);
		addPatients.add(lbDOB);
		addPatients.add(tfDay);
		addPatients.add(tfMonth);
		addPatients.add(tfYear);
		addPatients.add(lbSex);
		addPatients.add(rdbtnMale);
		addPatients.add(rdbtnFemale);
		addPatients.add(lbFirstName);
		addPatients.add(tfFirstName);
		addPatients.add(tfLastName);
		addPatients.add(lbLastName);
		addPatients.add(btnSubmit);
		addPatients.add(btnCancel);
		addPatients.add(lblWelcomeBackAdministrator);
		addPatients.add(date);
		addPatients.add(lblBackground);
		
		return addPatients;
	}
	/**
	 * This method returns true if form is completely filled out
	 */
	private boolean formComplete() 
	{
		//add all the text fields to an array
		ArrayList<JTextField> allTextFields = new ArrayList<JTextField>();
		allTextFields.add(tfFirstName);
		allTextFields.add(tfLastName);
		allTextFields.add(tfDay);
		allTextFields.add(tfMonth);
		allTextFields.add(tfYear);
		allTextFields.add(tfPhoneNum);
		allTextFields.add(tfEmail);
		//loop through array checking if they are not empty
		for(JTextField t : allTextFields)
		{
			if(!(t.getText().length() > 0))
			{
				return false;
			}
		}
		return true;
	}
	
	private void clearTextField() 
	{
		tfFirstName.setText(" ");
		tfLastName.setText(" ");
		tfDay.setText(" ");
		tfMonth.setText(" ");
		tfYear.setText(" ");
		tfPhoneNum.setText(" ");
		tfEmail.setText(" ");
	}
}
