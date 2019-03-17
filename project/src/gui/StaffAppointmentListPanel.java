package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import system.Hospital_Management_System;
import user.Employee;

/*
 * This class displays the add patient panel.
 */
public class StaffAppointmentListPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]{	
	"Date", "Time", "Patient First Name", "Patient Last Name"}, 0))
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) {  
			return false;            
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
		table.setRowHeight(50);
		table.setEnabled(true);
		JScrollPane tableContainer = new JScrollPane(table);
		tableContainer.setLocation(86, 244);
		tableContainer.setSize(1746, 700);
		//initialize the panel layout and size
		JPanel staffAppointmentListPanel = new JPanel();
		staffAppointmentListPanel.setLayout(null);
		staffAppointmentListPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(StaffAppointmentListPanel.class.getResource("/graphics/list_background.png")));
		lblBackground.setBounds(0, 0, 1920, 1080);
		/*
		 * HEADER MESSAGE
		 */
		JLabel lblWelcomeBack = new JLabel("Welcome Back!");
		lblWelcomeBack.setFont(bArial);
		lblWelcomeBack.setBounds(166, 29, 510, 26);
		/*
		 * DATE DISPLAYED BELOW HEADER
		 */
		DateFormat df = new SimpleDateFormat("EEE MMM dd, yyyy");
		Date today = new Date();
		JLabel date = new JLabel("Today is: "+df.format(today));
		date.setFont(new Font("Calibri Light", Font.PLAIN, 26));
		date.setBounds(166, 87, 560, 26);
		/*
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Logout");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayLoginPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(725, 955, 500, 59);
		//add all the components to panel
		staffAppointmentListPanel.add(btnReturn);
		staffAppointmentListPanel.add(tableContainer, BorderLayout.CENTER);
		staffAppointmentListPanel.add(lblWelcomeBack);
		staffAppointmentListPanel.add(date);
		staffAppointmentListPanel.add(lblBackground);
		
		return staffAppointmentListPanel;
	}
	/**
	 * This method adds a patient to a row in the table.
	 * @param patient The patient to be added
	 */
	public void addEmployeeToTable(Employee employee, Hospital_Management_System hms) 
	{
		model.addRow(new Object[]{employee.getID(), employee.getFirstName(), employee.getLastName(),
		employee.getSex(), employee.getDOB(), employee.getPhoneNum(), employee.getEmail(), "Add/Edit Appointment"});
		
		//SET CUSTOM RENDERER TO TEAMS COLUMN
		table.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());;
		//SET CUSTOM EDITOR TO TEAMS COLUMN
		table.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JTextField(), hms, employee.getID()));
	}
}
