package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import system.Hospital_Management_System;

/*
 * This class displays calendar panel.
 */
public class AprilCalendarPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JLabel patientName = new JLabel("");
	private JLabel appointmentTime = new JLabel("");
	private JTable table = new JTable(new DefaultTableModel(new Object[]
	{	
		"SUN","MON","TUE","WED","THU","FRI","SAT"
	}, 0))
	
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) 
		{  
			return false;          
		};
	};
	private DefaultTableModel model = (DefaultTableModel) table.getModel();
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//label for patient names
		patientName.setBounds(1120, 220, 382, 765);
		patientName.setFont(bArial);
		//label for appointment times
		appointmentTime.setBounds(1502, 220, 382, 765);
		appointmentTime.setFont(bArial);
		//set table settings
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(false);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(0);
		table.setRowHeight(113);
		table.setEnabled(true);
		/*
		 * Displays the date based off mouse click
		 */
		table.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				int row= table.rowAtPoint(e.getPoint());
				int col= table.columnAtPoint(e.getPoint());
				//temporary hard coded month and year values passed
				//will be fixed once we implement the full calendar
				ArrayList<String> appointmentData = hms.generateDaySchedule(table.getValueAt(row, col).toString(), "04", "2019");
				patientName.setText(appointmentData.get(0));
				appointmentTime.setText(appointmentData.get(1));
			}
		});
		JScrollPane tableContainer = new JScrollPane(table);
		tableContainer.setLocation(48, 319);
		tableContainer.setSize(1046, 701);
		//initialize the panel layout and size
		JPanel calendarPanel = new JPanel();
		calendarPanel.setLayout(null);
		calendarPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AprilCalendarPanel.class.getResource("/graphics/staffCalendar_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * HEADER MESSAGE
		 */
		JLabel lblWelcomeBackAdministrator = new JLabel("Your monthly schedule");
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
		 * HEADER MESSAGE
		 */
		JLabel lblMonthYear = new JLabel("APRIL 2019");
		lblMonthYear.setFont(new Font("Arial", Font.BOLD, 90));
		lblMonthYear.setBounds(250, 220, 700, 100);
		/*
		 * NEXT MONTH BUTTON
		 */
		JButton btnNext = new JButton(">>>");
		btnNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//not availiable right now
				//to be implemented
			}
		});
		btnNext.setFont(new Font("Arial", Font.BOLD, 16));
		btnNext.setBounds(980, 240, 100, 50);
		/*
		 * PREV MONTH BUTTON
		 */
		JButton btnPrev = new JButton("<<<");
		btnPrev.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayMarchCalendarPage();
			}
		});
		btnPrev.setFont(new Font("Arial", Font.BOLD, 16));
		btnPrev.setBounds(55, 240, 100, 50);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayEmployeeMainPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(1310, 990, 400, 40);
		//add all the components to panel
		calendarPanel.add(patientName);
		calendarPanel.add(appointmentTime);
		calendarPanel.add(btnNext);
		calendarPanel.add(btnPrev);
		calendarPanel.add(btnReturn);
		calendarPanel.add(tableContainer, BorderLayout.CENTER);
		calendarPanel.add(lblWelcomeBackAdministrator);
		calendarPanel.add(date);
		calendarPanel.add(lblMonthYear);
		calendarPanel.add(lblBackground);
		
		model.addRow(new Object[]{" "," "," "," "," "," "," "});
		model.addRow(new Object[]{" ","1","2","3","4","5","6"});
		model.addRow(new Object[]{"7","8","9","10","11","12","13"});
		model.addRow(new Object[]{"14","15","16","17","18","19","20"});
		model.addRow(new Object[]{"21","22","23","24","25","26","27"});
		model.addRow(new Object[]{"28","29","30"," "," "," "," "});
		
		return calendarPanel;
	}
}
