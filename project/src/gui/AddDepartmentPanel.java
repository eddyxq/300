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
public class AddDepartmentPanel 
{
	private JTextField tfDepartment;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private AddAppointmentPanel aap;
	private EditAppointmentPanel eap;
	private AddStaffPanel asp;
	/**
	 * This method creates and returns a JPanel
	 * @param hms
	 * @return this panel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel addDepartmentPanel = new JPanel();
		addDepartmentPanel.setLayout(null);
		addDepartmentPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AddDepartmentPanel.class.getResource("/graphics/addDepartment_background.png")));
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
		 * DEPARTMENT
		 */
		JLabel lbDepartment = new JLabel("Department: ");
		lbDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		lbDepartment.setBounds(910, 500, 250, 50);
		/*
		 * DEPARTMENT TEXT FIELD
		 */
		tfDepartment = new JTextField();
		tfDepartment.setBounds(809, 540, 300, 30);
		tfDepartment.setColumns(10);
		/*
		 * CANCEL BUTTON
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayManageDepartmentPage();
			}
		});
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancel.setBounds(1133, 942, 400, 59);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(383, 942, 400, 59);
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//add department to list
				hms.getDepartmentRecord().add(tfDepartment.getText());
				aap = hms.getAAP();
				aap.setDeptList();
				eap = hms.getEAP();
				eap.setDeptList();
				asp = hms.getASP();
				asp.setDeptList();
				//display confirmation message
				Object[] options = {"Ok"};
				JOptionPane.showOptionDialog(null, "Department added.", "Success",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, options, options[0]);
				//clear the text field
				tfDepartment.setText("");
				
			}
		});
		// Adds all the components to the panel.
		addDepartmentPanel.add(tfDepartment);
		addDepartmentPanel.add(lbDepartment);
		addDepartmentPanel.add(btnSubmit);
		addDepartmentPanel.add(btnCancel);
		addDepartmentPanel.add(lblWelcomeBackAdministrator);
		addDepartmentPanel.add(date);
		addDepartmentPanel.add(lblBackground);
		
		return addDepartmentPanel;
	}
}
