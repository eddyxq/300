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
import user.Patient;

/*
 * This class displays the add patient panel.
 */
public class AppointmentListPanelAdmin 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]{	
	 "Appointment Date", "Appointment Time", "Option"}, 0))
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) {  
			return column == 2;            
    };
	};
	private DefaultTableModel model = (DefaultTableModel) table.getModel();
	/**
	 * This method creates and returns a JPanel
	 * @param hms
	 * @return this panel
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
		JPanel appointmentListPanel = new JPanel();
		appointmentListPanel.setLayout(null);
		appointmentListPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AppointmentListPanelAdmin.class.getResource("/graphics/list_background.png")));
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
		 * RETURN BUTTON
		 */
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				hms.displayPatientListPage();
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(725, 955, 500, 59);
		//add all the components to panel
		appointmentListPanel.add(btnReturn);
		appointmentListPanel.add(tableContainer, BorderLayout.CENTER);
		appointmentListPanel.add(lblWelcomeBackAdministrator);
		appointmentListPanel.add(date);
		appointmentListPanel.add(lblBackground);
		
		return appointmentListPanel;
	}
	/*
	 * Adds appointment to the list
	 */
	public void addAppointmentToTable(Patient patient, Hospital_Management_System hms) 
	{
		model.addRow(new Object[]{patient.getAppointmentDate(), patient.getAppointmentTime(), 
				"Edit/Remove Appointment"});
		//set custom renderer and editor to column
				table.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());;
				table.getColumnModel().getColumn(2).setCellEditor(new BtnEditorAdminViewAppointment(new JTextField(), hms, patient.getID()));
	}
}
