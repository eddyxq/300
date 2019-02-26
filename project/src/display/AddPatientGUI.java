package display;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import system.Hospital_Management_System;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class AddPatientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField txtYear;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtAreaCode;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	private String firstName;
	private String lastName;
	private Hospital_Management_System hms;
	
	/**
	 * Launch the application.
	 */
	public void addPatient(Hospital_Management_System hms) {
		this.hms = hms;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPatientGUI frame = new AddPatientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddPatientGUI() {
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setTitle("Add a Patient");
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 353);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appendPatientToRecord(hms);
				dispose();
			}
		});
		btnSubmit.setBounds(244, 267, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(586, 267, 89, 23);
		contentPane.add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.info);
		panel_1.setBounds(10, 31, 844, 225);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lastNameTextField = new JTextField();
		lastNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastName = lastNameTextField.getText();
			}
		});
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(208, 78, 86, 20);
		panel_1.add(lastNameTextField);
		
		txtYear = new JTextField();
		txtYear.setText("Year");
		txtYear.setBounds(334, 112, 55, 20);
		panel_1.add(txtYear);
		txtYear.setColumns(10);
		
		txtDay = new JTextField();
		txtDay.setDropMode(DropMode.INSERT);
		txtDay.setText("Day");
		txtDay.setColumns(10);
		txtDay.setBounds(208, 112, 55, 20);
		panel_1.add(txtDay);
		
		txtMonth = new JTextField();
		txtMonth.setText("Month");
		txtMonth.setColumns(10);
		txtMonth.setBounds(271, 112, 55, 20);
		panel_1.add(txtMonth);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(SystemColor.menu);
		rdbtnMale.setBounds(208, 146, 55, 23);
		panel_1.add(rdbtnMale);
		
		JLabel lblAddress = new JLabel("Address: ");
		lblAddress.setBounds(18, 197, 62, 14);
		panel_1.add(lblAddress);
		
		JLabel lblContactInformations = new JLabel("Contact Informations:");
		lblContactInformations.setBounds(474, 11, 126, 14);
		panel_1.add(lblContactInformations);
		
		JLabel lblPersonalInfomations = new JLabel("Personal Infomations:");
		lblPersonalInfomations.setBounds(16, 17, 126, 14);
		panel_1.add(lblPersonalInfomations);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(474, 79, 109, 14);
		panel_1.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(593, 76, 165, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(10, 36, 407, 155);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(8, 11, 179, 14);
		panel.add(lblFirstName);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(8, 110, 179, 14);
		panel.add(lblGender);
		
		JLabel lblAge = new JLabel("Date of Birth:");
		lblAge.setBounds(8, 75, 179, 14);
		panel.add(lblAge);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(9, 42, 178, 14);
		panel.add(lblLastName);
		
		firstNameTextField = new JTextField();
		firstNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstName = firstNameTextField.getText();	s
			}
		});
		firstNameTextField.setBounds(197, 10, 86, 20);
		panel.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(341, 109, 55, 23);
		panel.add(rdbtnOther);
		rdbtnOther.setBackground(SystemColor.menu);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(262, 110, 73, 23);
		panel.add(rdbtnFemale);
		rdbtnFemale.setBackground(SystemColor.menu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(459, 36, 375, 79);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtAreaCode = new JTextField();
		txtAreaCode.setBounds(135, 11, 62, 20);
		panel_2.add(txtAreaCode);
		txtAreaCode.setText("Area Code");
		txtAreaCode.setColumns(10);
		
		JLabel label = new JLabel("-");
		label.setBounds(200, 13, 10, 14);
		panel_2.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(208, 11, 34, 20);
		panel_2.add(textField_2);
		textField_2.setText("###");
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(245, 14, 10, 14);
		panel_2.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(253, 11, 46, 20);
		panel_2.add(textField_3);
		textField_3.setText("####");
		textField_3.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setBounds(11, 11, 114, 14);
		panel_2.add(lblPhoneNumber);
	}
	
	private void appendPatientToRecord(Hospital_Management_System hms) {
		hms.appPatientToRecord(firstName, lastName, 17, "403-111-1111");
	}
	
}
