package display;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestPanel extends JPanel {
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
	 * Create the panel.
	 */
	public TestPanel() {
		setSize(1920, 1080);
		setLayout(null);
		
		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back Administrator!");
		lblWelcomeBackAdministrator.setFont(bArial);
		lblWelcomeBackAdministrator.setBounds(166, 29, 510, 26);
		add(lblWelcomeBackAdministrator);
		
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		add(date);
		
//		JLabel lblAppointment = new JLabel("Your Appointment is at: " + " " + p.getAppoint());
//		lblAppointment.setFont(bArial);
//		lblAppointment.setBounds(574, 533, 476, 82);
//		add(lblAppointment);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(375, 960, 169, 59);
		add(btnSubmit);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(55, 950, 169, 59);
		add(btnReturn);
//		
//		JButton btnCancel = new JButton("Cancel");
//		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
//		btnCancel.setBounds(1439, 960, 169, 59);
//		add(btnCancel);
//		
//		JLabel lbFirstName = new JLabel("First Name: ");
//		lbFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lbFirstName.setBounds(78, 268, 100, 50);
//		add(lbFirstName);
//		
//		tfFirstName = new JTextField();
//		tfFirstName.setBounds(640, 285, 300, 20);
//		add(tfFirstName);
//		tfFirstName.setColumns(10);
//		
//		tfLastName = new JTextField();
//		tfLastName.setColumns(10);
//		tfLastName.setBounds(640, 337, 300, 20);
//		add(tfLastName);
//		
//		JLabel lbLastName = new JLabel("Last Name: ");
//		lbLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lbLastName.setBounds(78, 320, 100, 50);
//		add(lbLastName);
//		
//		JLabel lbSex = new JLabel("Sex: ");
//		lbSex.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lbSex.setBounds(78, 371, 100, 50);
//		add(lbSex);
//		
//		JRadioButton rdbtnMale = new JRadioButton("Male");
//		rdbtnMale.setBackground(bgColor);
//		rdbtnMale.setBounds(640, 387, 100, 23);
//		add(rdbtnMale);
//		
//		JRadioButton rdbtnFemale = new JRadioButton("Female");
//		rdbtnFemale.setBackground(bgColor);
//		rdbtnFemale.setBounds(748, 387, 100, 23);
//		add(rdbtnFemale);
//		
//		JRadioButton rdbtnOther = new JRadioButton("Other");
//		rdbtnOther.setBackground(bgColor);
//		rdbtnOther.setBounds(853, 387, 87, 23);
//		add(rdbtnOther);
//		
//		JLabel lblFdsfdaff = new JLabel("/");
//		lblFdsfdaff.setBounds(728, 448, 24, 14);
//		add(lblFdsfdaff);
//		
//		JLabel label = new JLabel("/");
//		label.setBounds(834, 448, 24, 14);
//		add(label);
//		
//		JLabel lbDOB = new JLabel("Date of birth (dd/mm/yyyy): ");
//		lbDOB.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lbDOB.setBounds(78, 428, 300, 50);
//		add(lbDOB);
//		
//		txDay = new JTextField();
//		txDay.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				txDay.setText("");
//			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				txDay.setText("Day");
//			}
//		});
//		txDay.setText("Day");
//		txDay.setBounds(640, 445, 70, 20);
//		add(txDay);
//		txDay.setColumns(10);
//		
//		tfMonth = new JTextField();
//		tfMonth.setText("Month");
//		tfMonth.setColumns(10);
//		tfMonth.setBounds(754, 445, 70, 20);
//		add(tfMonth);
//		
//		tfYear = new JTextField();
//		tfYear.setText("Year");
//		tfYear.setColumns(10);
//		tfYear.setBounds(856, 445, 70, 20);
//		add(tfYear);
//		
//		JLabel lblPhoneNumber = new JLabel("Phone Number: ");
//		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lblPhoneNumber.setBounds(78, 489, 250, 50);
//		add(lblPhoneNumber);
//		
//		tfPhoneNum = new JTextField();
//		tfPhoneNum.setColumns(10);
//		tfPhoneNum.setBounds(640, 506, 300, 20);
//		add(tfPhoneNum);
//		
//		JLabel lbEmail = new JLabel("E-mail: ");
//		lbEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lbEmail.setBounds(78, 548, 250, 50);
//		add(lbEmail);
//		
//		tfEmail = new JTextField();
//		tfEmail.setColumns(10);
//		tfEmail.setBounds(640, 565, 300, 20);
//		add(tfEmail);
//		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/PatientAppointment_background.png")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		add(lblNewLabel);
	}
}
