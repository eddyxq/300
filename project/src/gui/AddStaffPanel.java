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
import javax.swing.JComboBox;
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
public class AddStaffPanel 
{
	private String[] departments = { "General Practitioner", "Nurse", "Operation Staff", "Physician", "Surgeon" };
	
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private Color bgColor = new Color(215,215,215);
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JTextField tfPhoneNum;
	private JTextField tfEmail;

	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel addStaff = new JPanel();
		addStaff.setLayout(null);
		addStaff.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AddStaffPanel.class.getResource("/graphics/AddStaffbackground.png")));
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
		JLabel date = new JLabel("Today is: "+ df.format(today));
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
		 * DEPARTMENTS
		 */
		JLabel lbDepartment = new JLabel("Department: ");
		lbDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDepartment.setBounds(78, 428, 300, 50);
		
		JComboBox departmentList = new JComboBox(departments);
		departmentList.setBounds(640, 445, 250, 20);
		departmentList.setSize(300, 20);
		departmentList.setSelectedIndex(0);
		
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
				hms.displayStaffManagementPage();
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
					

					//display confirmation message
					Object[] options = {"Ok"};
					JOptionPane.showOptionDialog(null, "Patient has been added.", "Success",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, options, options[0]);
					//go back to previous menu
					clearTextField();
					hms.displayPatientManagementPage();
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
		addStaff.add(lbDepartment);
		addStaff.add(departmentList);
		addStaff.add(lblPhoneNumber);
		addStaff.add(tfPhoneNum);
		addStaff.add(lbEmail);
		addStaff.add(tfEmail);
		addStaff.add(lbSex);
		addStaff.add(rdbtnMale);
		addStaff.add(rdbtnFemale);
		addStaff.add(lbFirstName);
		addStaff.add(tfFirstName);
		addStaff.add(tfLastName);
		addStaff.add(lbLastName);
		addStaff.add(btnSubmit);
		addStaff.add(btnCancel);
		addStaff.add(lblWelcomeBackAdministrator);
		addStaff.add(date);
		addStaff.add(lblBackground);
		
		return addStaff;
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
	/**
	 * This method resets all the text fields
	 */
	private void clearTextField() 
	{
		tfFirstName.setText("");
		tfLastName.setText("");
		tfPhoneNum.setText("");
		tfEmail.setText("");
	}
}
