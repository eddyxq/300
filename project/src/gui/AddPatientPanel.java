package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import display.TestPanel;

/*
 * This class is a test panel
 */
public class AddPatientPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTextField tfFirstName;
	private JTextField tfLastName;
	private Color bgColor = new Color(215,215,215);
	private JTextField txDay;
	private JTextField tfMonth;
	private JTextField tfYear;
	private JTextField tfPhoneNum;
	private JTextField tfEmail;
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel()
	{
		JPanel addPatients = new JPanel();
		addPatients.setLayout(null);
		addPatients.setBounds(0, 0, 1920, 1080);

		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back Administrator!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 510, 26);
		
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(370, 960, 169, 59);
			
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancel.setBounds(1400, 960, 169, 59);
		
		JLabel lbFirstName = new JLabel("First Name: ");
		lbFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbFirstName.setBounds(78, 268, 100, 50);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(640, 285, 300, 20);
		
		tfFirstName.setColumns(10);
		
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(640, 337, 300, 20);
		
		JLabel lbLastName = new JLabel("Last Name: ");
		lbLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLastName.setBounds(78, 320, 100, 50);
		
		JLabel lbSex = new JLabel("Sex: ");
		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbSex.setBounds(78, 371, 100, 50);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(bgColor);
		rdbtnMale.setBounds(640, 387, 100, 23);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(bgColor);
		rdbtnFemale.setBounds(748, 387, 100, 23);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBackground(bgColor);
		rdbtnOther.setBounds(853, 387, 87, 23);
		
		JLabel lblFdsfdaff = new JLabel("/");
		lblFdsfdaff.setBounds(728, 448, 24, 14);
		
		JLabel label = new JLabel("/");
		label.setBounds(834, 448, 24, 14);
		
		JLabel lbDOB = new JLabel("Date of birth (dd/mm/yyyy): ");
		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDOB.setBounds(78, 428, 300, 50);
		
		txDay = new JTextField();
		txDay.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txDay.setText("");
			}
		});
		txDay.setText("Day");
		txDay.setBounds(640, 445, 70, 20);
		
		
		txDay.setColumns(10);
		
		tfMonth = new JTextField();
		tfMonth.setText("Month");
		tfMonth.setColumns(10);
		tfMonth.setBounds(754, 445, 70, 20);
		
		tfMonth.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				tfMonth.setText("");
			}
		});
		
		tfYear = new JTextField();
		tfYear.setText("Year");
		tfYear.setColumns(10);
		tfYear.setBounds(856, 445, 70, 20);
		
		tfYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				tfYear.setText("");
			}
		});
		
		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(78, 489, 250, 50);
		
		tfPhoneNum = new JTextField();
		tfPhoneNum.setColumns(10);
		tfPhoneNum.setBounds(640, 506, 300, 20);
		
		JLabel lbEmail = new JLabel("E-mail: ");
		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbEmail.setBounds(78, 548, 250, 50);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(640, 565, 300, 20);
		
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AddPatientPanel.class.getResource("/graphics/AddPatientBackground.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		
		//Adding Components 
		addPatients.add(lblPhoneNumber);
		addPatients.add(tfPhoneNum);
		addPatients.add(lbEmail);
		addPatients.add(tfEmail);
		addPatients.add(lblFdsfdaff);
		addPatients.add(label);
		addPatients.add(lbDOB);
		addPatients.add(txDay);
		addPatients.add(tfMonth);
		addPatients.add(tfYear);
		addPatients.add(lbSex);
		addPatients.add(rdbtnMale);
		addPatients.add(rdbtnFemale);
		addPatients.add(rdbtnOther);
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
	
}
