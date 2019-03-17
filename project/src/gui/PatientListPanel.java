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
public class PatientListPanel 
{
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private JTable table = new JTable(new DefaultTableModel(new Object[]{	
	"ID", "First Name", "Last Name", "Sex", "Date of Birth", "Phone Number", "E-mail", "Option"}, 0))
	{
		private static final long serialVersionUID = 1L;
		public boolean isCellEditable(int row, int column) {  
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
		lblBackground.setIcon(new ImageIcon(PatientListPanel.class.getResource("/graphics/PatientList_background.png")));
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
				hms.displayPatientManagementPage();
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
		patient.getSex(), patient.getDOB(), patient.getPhoneNum(), patient.getEmail(), "Add/Edit Appointment"});
		
		//set custom renderer and editor to column
		table.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());;
		table.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JTextField(), hms, patient.getID()));
	}
}
