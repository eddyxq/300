package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import system.Appointment;
import system.Hospital_Management_System;

/*
 * This class displays the add patient panel.
 */
public class AppointmentListPanelAdmin 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]{	
	 "Appointment Date", "Appointment Time", "Doctor", "Modify", "Booking", "Check In", "Check Out"}, 0))
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) {  
			switch(column) {
			case 3:
				return true;
			case 4:
				return true;
			case 5:
				return true;
			case 6:
				return true;
			default:
				return false;
		}           
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
		table.getTableHeader().setReorderingAllowed(false);
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
		JLabel lblWelcomeBackAdministrator = new JLabel("Welcome Back!");
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
	public void addAppointmentToTable(Appointment appointment, Hospital_Management_System hms) 
	{
		model.addRow(new Object[]{appointment.getDate(), appointment.getTime(), appointment.getDocName(),
				"Edit", "Remove", "Check In", "Check Out"});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				table.getColumnModel().getColumn(3).setCellEditor(new BtnEditorEditAppointment(new JTextField(), hms, appointment));
				table.getColumnModel().getColumn(4).setCellEditor(new BtnEditorRemoveAppointment(new JTextField(), hms, appointment));
				table.getColumnModel().getColumn(5).setCellEditor(new BtnEditorCheckInAppointment(new JTextField(), hms, appointment));
				table.getColumnModel().getColumn(6).setCellEditor(new BtnEditorCheckOutAppointment(new JTextField(), hms, appointment));		
			}
		});
				// set width for columns
				table.getColumnModel().getColumn(3).setPreferredWidth(5);
				table.getColumnModel().getColumn(4).setPreferredWidth(5);
				table.getColumnModel().getColumn(5).setPreferredWidth(5);
				table.getColumnModel().getColumn(6).setPreferredWidth(5);
				// set custom renderer and editor to column
				table.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());;
				table.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());;
				table.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());;
				table.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());;
	}
	
	public void clearAllRow() {
		int rowCount = model.getRowCount();
		//Remove rows one by one from the end of the table
		for (int i = rowCount - 1; i >= 0; i--) {
			model.removeRow(i);
		}
	}
}
