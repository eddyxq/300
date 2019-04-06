package gui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import system.Hospital_Management_System;
import system.ValidateInput;
import user.Patient;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
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
	private JTextField tfDate;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private Color Red = new Color(255, 150, 135);
	private Color Default = new Color(255,255,255);
	private ValidateInput val = new ValidateInput();
	//Time slots for selection
	private String[] timeSlots = {"06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00",
			"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
			"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30"};
	/**
	 * Create the panel.
	 */
	public Test() {
		setBounds(0, 0, 1920, 1080);
		/*
		 * DATE
		 */
		setLayout(null);
		JLabel lblDate = new JLabel("Date: (DD/MM/YYYY)");
		lblDate.setBounds(696, 410, 300, 30);
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		add(lblDate);
		/*
		 * Text Field for Appointment Date
		 */
		tfDate = new JTextField();
		tfDate.setBounds(1123, 417, 200, 20);
		tfDate.setColumns(10);
		add(tfDate);
		/*
		 * START TIME
		 */
		JLabel lbStartTime = new JLabel("Start Time: (HH:MM)");
		lbStartTime.setBounds(696, 568, 250, 20);
		lbStartTime.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbStartTime);
		/*
		 * Drop-down menu for Appointment Start Time
		 */
		JComboBox jcStartTime = new JComboBox(timeSlots);
		jcStartTime.setBounds(1170, 570, 100, 20);
		jcStartTime.setSelectedIndex(0);
		add(jcStartTime);
		/*
		 * END TIME
		 */
		JLabel lbEndTime = new JLabel("End Time: (HH:MM)");
		lbEndTime.setBounds(696, 623, 300, 14);
		lbEndTime.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbEndTime);
		/*
		 * Drop-down for Appointment End Time
		 */
		JComboBox jcEndTime = new JComboBox(timeSlots);
		jcEndTime.setBounds(1170, 622, 100, 20);
		jcEndTime.setSelectedIndex(1);
		add(jcEndTime);
		/*
		 * DEPARTMENT
		 */
		JLabel lbDepartment = new JLabel("Department: ");
		lbDepartment.setBounds(696, 451, 250, 50);
		lbDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbDepartment);
		JComboBox jcDepartment = new JComboBox();
		jcDepartment.setBounds(1123, 468, 200, 20);
		jcDepartment.setSelectedIndex(0);
		add(jcDepartment);
		/*
		 * DOCTORS
		 */
		JLabel lbDoctors = new JLabel("Doctor: ");
		lbDoctors.setBounds(696, 505, 112, 42);
		lbDoctors.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbDoctors);
		JComboBox jcDoctors = new JComboBox();
		jcDoctors.setBounds(1046, 518, 169, 20);
		jcDoctors.setSelectedIndex(0);
		add(jcDoctors);
		/*
		 * CANCEL BUTTON
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(1101, 842, 169, 59);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnCancel);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(740, 842, 169, 59);
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		add(btnSubmit);
		/*
		* VIEW SCHEDULE BUTTON
		*/
		JButton btnViewSchedule = new JButton("View Schedule");
		btnViewSchedule.setBounds(1225, 517, 155, 20);
		btnViewSchedule.setFont(new Font("Arial", Font.PLAIN, 13));
		add(btnViewSchedule);		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1920, 1080);
		label.setIcon(new ImageIcon(Test.class.getResource("/graphics/addApp_backgrounds.png")));
		add(label);
	}
	}
