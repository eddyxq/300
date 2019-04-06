package gui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import user.Patient;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Test extends JPanel {
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private JTextField tfDay;
	private JTextField tfMonth;
	private JTextField tfYear;
	private JTextField tfPhoneNum;
	private JTextField tfEmail;
	private JRadioButton rdbtnClear;
	/**
	 * Create the panel.
	 */
	public Test() {
		setBounds(0, 0, 1920, 1080);
		setLayout(null);
		JLabel lbFirstName = new JLabel("First Name: ");
		lbFirstName.setBounds(660, 388, 100, 50);
		lbFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbFirstName);
		
		JLabel label_1 = new JLabel("E-mail: ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(660, 735, 250, 50);
		add(label_1);
		tfFirstName = new JTextField();
		tfFirstName.setBounds(1066, 405, 300, 20);
		tfFirstName.setColumns(10);
		add(tfFirstName);
		JLabel lbLastName = new JLabel("Last Name: ");
		lbLastName.setBounds(660, 440, 100, 50);
		lbLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbLastName);
		tfLastName = new JTextField();
		tfLastName.setBounds(1066, 457, 300, 20);
		tfLastName.setColumns(10);
		add(tfLastName);
		JLabel lbSex = new JLabel("Sex: ");
		lbSex.setBounds(660, 501, 100, 42);
		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbSex);
		//male button
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(1104, 507, 100, 23);
		rdbtnMale.setOpaque(false);
		add(rdbtnMale);
		//female button
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(1230, 507, 100, 23);
		rdbtnFemale.setOpaque(false);
		add(rdbtnFemale);
		JLabel slash = new JLabel("/");
		slash.setBounds(1146, 572, 24, 14);
		add(slash);
		JLabel label1 = new JLabel("/");
		label1.setBounds(1266, 572, 24, 14);
		add(label1);
		JLabel lbDOB = new JLabel("Date of birth (dd/mm/yyyy): ");
		lbDOB.setBounds(660, 552, 300, 50);
		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbDOB);
		//day
		tfDay = new JTextField();
		tfDay.setBounds(1066, 569, 70, 20);
		tfDay.setText("Day");
		tfDay.setColumns(10);
		add(tfDay);
		//month
		tfMonth = new JTextField();
		tfMonth.setBounds(1186, 569, 70, 20);
		tfMonth.setText("Month");
		tfMonth.setColumns(10);
		add(tfMonth);
		//year
		tfYear = new JTextField();
		tfYear.setBounds(1296, 569, 70, 20);
		tfYear.setText("Year");
		tfYear.setColumns(10);
		add(tfYear);
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(660, 609, 250, 50);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblPhoneNumber);
		tfPhoneNum = new JTextField();
		tfPhoneNum.setBounds(1066, 626, 300, 20);
		tfPhoneNum.setColumns(10);
		add(tfPhoneNum);
		JLabel lbEmail = new JLabel("E-mail: ");
		lbEmail.setBounds(660, 668, 250, 50);
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbEmail);
		tfEmail = new JTextField();
		tfEmail.setBounds(1066, 685, 300, 20);
		tfEmail.setColumns(10);
		add(tfEmail);
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(1172, 876, 169, 59);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnCancel);
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(636, 876, 169, 59);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnSubmit);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1920, 1080);
		label.setIcon(new ImageIcon(Test.class.getResource("/graphics/AddPatientBackground.png")));
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(1066, 752, 28, 20);
		add(comboBox);
		
		/*
		 * FIRST NAME
		 */
		/*
		 * LAST NAME
		 */
		/*
		 * SEX
		 */
		/*
		 * DOB
		 */
		/*
		 * PHONE NUMBER
		 */
		/*
		 * EMAIL
		 */
		/*
		 * CANCEL BUTTON
		 */
		/*
		 * SUBMIT BUTTON
		 */
	}
	}
