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
import system.Hospital_Management_System;
import user.Patient;

/*
 * This class displays the add patient panel.
 */
public class PatientListPanel 
{
	private int id = 0;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]{	
	"ID", "First Name", "Last Name", "Sex", "Date of Birth", "Phone Number", "E-mail", "Display", "Modify"}, 0))
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) {  
			switch(column) {
				case 7:
					return true;
				case 8:
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
		JScrollPane tableContainer = new JScrollPane(table);
		tableContainer.setLocation(86, 244);
		tableContainer.setSize(1746, 700);
		//initialize the panel layout and size
		JPanel patientListPanel = new JPanel();
		patientListPanel.setLayout(null);
		patientListPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(PatientListPanel.class.getResource("/graphics/list_background.png")));
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
				if(hms.getAccessFrom() == "Admin")
				{
					hms.displayPatientManagementPage();
				}
				else if(hms.getAccessFrom() == "Employee")
				{
					hms.displayEmployeeMainPage();
				}
			}
		});
		btnReturn.setFont(new Font("Arial", Font.BOLD, 16));
		btnReturn.setBounds(725, 955, 500, 59);
		//add all the components to panel
		patientListPanel.add(btnReturn);
		patientListPanel.add(tableContainer, BorderLayout.CENTER);
		patientListPanel.add(lblWelcomeBackAdministrator);
		patientListPanel.add(date);
		patientListPanel.add(lblBackground);
		
		return patientListPanel;
	}
	/**
	 * This method adds a patient to a row in the table.
	 * @param patient The patient to be added
	 */
	public void addPatientToTable(Patient patient, Hospital_Management_System hms) 
	{
		model.addRow(new Object[]{patient.getID(), patient.getFirstName(), patient.getLastName(),
		patient.getSex(), patient.getDOB(), patient.getPhoneNum(), patient.getEmail(), "View Appointment(s)",
		"Add/Edit"});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				id = (int)table.getValueAt(table.getSelectedRow(), 0);
				table.getColumnModel().getColumn(7).setCellEditor(new BtnEditorAdminViewAppointment(new JTextField(), hms, id));
				table.getColumnModel().getColumn(8).setCellEditor(new BtnEditorAddAppointment(new JTextField(), hms, id));
				
			}
		});
		
		//set custom renderer and editor to column
		table.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
		table.getColumnModel().getColumn(8).setCellRenderer(new ButtonRenderer());
		
	}
}
