package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import system.Hospital_Management_System;
import user.Patient;

/*
 * This class displays the add patient panel.
 */
public class CalendarPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]
	{	
		"SUN","MON","TUE","WED","THU","FRI","SAT"
	}, 0))
	
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) 
		{  
			return column == 7;            
		};
	};
	private DefaultTableModel model = (DefaultTableModel) table.getModel();
	/**
	 * This method creates and returns a JPanel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//set table settings
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(true);
		table.setRowHeight(113);
		table.setEnabled(true);
		JScrollPane tableContainer = new JScrollPane(table);
		tableContainer.setLocation(45, 319);
		tableContainer.setSize(1046, 701);
		//initialize the panel layout and size
		JPanel calendarPanel = new JPanel();
		calendarPanel.setLayout(null);
		calendarPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(PatientListPanel.class.getResource("/graphics/staffCalendar_background.png")));
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
		JLabel lblMonthYear = new JLabel("MARCH 2019");
		lblMonthYear.setFont(new Font("Arial", Font.BOLD, 100));
		lblMonthYear.setBounds(250, 220, 700, 100);
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
		btnReturn.setBounds(1255, 955, 500, 59);
		//add all the components to panel
		calendarPanel.add(btnReturn);
		calendarPanel.add(tableContainer, BorderLayout.CENTER);
		calendarPanel.add(lblWelcomeBackAdministrator);
		calendarPanel.add(date);
		calendarPanel.add(lblMonthYear);
		calendarPanel.add(lblBackground);
		
		model.addRow(new Object[]{" "," "," "," "," ","1","2"});
		model.addRow(new Object[]{"3","4","5","6","7","8","9"});
		model.addRow(new Object[]{"10","11","12","13","14","15","16"});
		model.addRow(new Object[]{"17","18","19","20","21","22","23"});
		model.addRow(new Object[]{"24","25","26","27","28","29","30"});
		model.addRow(new Object[]{"31"," "," "," "," "," "," "});
		
		return calendarPanel;
	}
}
