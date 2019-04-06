package gui;

import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import system.Hospital_Management_System;

/*
 * This class displays the add patient panel.
 */
public class DepartmentStatisticsPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
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
		lblBackground.setIcon(new ImageIcon(DepartmentStatisticsPanel.class.getResource("/graphics/departmentStats_backgrounds.png")));
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
		JLabel lbDeptStats = new JLabel();
		lbDeptStats.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbDeptStats.setBounds(59, 269, 897, 670);
		lbDeptStats.setVerticalAlignment(JLabel.TOP);
		//display number of physicians working at each department
		String output = "Department" + "<br/>";
		for(String s : hms.getDepartmentRecord())
		{
			//System.out.println(s);
			
			output += s + " " + "currently has: " +  hms.countDoctorsInDepartment(s) 
			+ " " + "Physicians." + "<br/>";
		}
		output = "<html>" + output + "</html>"; 
		lbDeptStats.setText(output);
		/*
		 * PATIENT ACTIVITY (RIGHT PANEL)
		 */
		JLabel lbPatientActivity = new JLabel("");
		lbPatientActivity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPatientActivity.setBounds(990, 269, 855, 670);
		lbPatientActivity.setVerticalAlignment(JLabel.TOP);
		//add all the components to panel
		departmentStatistics.add(lbDeptStats);
		departmentStatistics.add(lbPatientActivity);
		departmentStatistics.add(lblWelcomeBackAdministrator);
		departmentStatistics.add(date);
		departmentStatistics.add(lblBackground);
		
		return departmentStatistics;
	}
}
