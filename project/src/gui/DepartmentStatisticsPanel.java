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
import system.ValidateInput;
import user.Patient;

/*
 * This class displays the add patient panel.
 */
public class DepartmentStatisticsPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private Color bgColor = new Color(215,215,215);
	/**
	 * This method creates and returns a JPanel
	 * @param hms
	 * @return this panel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel departmentStatistics = new JPanel();
		departmentStatistics.setLayout(null);
		departmentStatistics.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(DepartmentStatisticsPanel.class.getResource("/graphics/AddPatientBackground.png")));
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
		 * DEPARTMENT STATISTICS (LEFT PANEL)
		 */
		JLabel lbDeptStats = new JLabel("DEPARTMENT STATISTICS");
		lbDeptStats.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbDeptStats.setBounds(59, 269, 897, 670);
		/*
		 * PATIENT ACTIVITY (RIGHT PANEL)
		 */
		JLabel lbPatientActivity = new JLabel("DEPARTMENT STATISTICS");
		lbPatientActivity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPatientActivity.setBounds(990, 269, 855, 670);
		//add all the components to panel
		departmentStatistics.add(lbDeptStats);
		departmentStatistics.add(lbPatientActivity);
		departmentStatistics.add(lblWelcomeBackAdministrator);
		departmentStatistics.add(date);
		departmentStatistics.add(lblBackground);
		
		return departmentStatistics;
	}
}
