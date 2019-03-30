package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import system.Hospital_Management_System;
import system.ValidateInput;

/*
 * This class displays the add patient panel.
 */
public class AddAppointmentPanel 
{
	private JTextField tfDate;
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	private Color Red = new Color(255, 150, 135);
	private Color Default = new Color(255,255,255);
	private ValidateInput val = new ValidateInput();
	//Time slots for selection
	private String[] timeSlots = {"06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00",
			"10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30",
			"16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30"};
	private JComboBox<String> jcDoctors;
	/**
	 * This method creates and returns a JPanel
	 * @param hms
	 * @return this panel
	 */
	public JPanel createPanel(Hospital_Management_System hms)
	{
		//initialize the panel layout and size
		JPanel addAppointmentPanel = new JPanel();
		addAppointmentPanel.setLayout(null);
		addAppointmentPanel.setBounds(0, 0, 1920, 1080);
		//set background
		JLabel lblBackground = new JLabel();
		lblBackground.setIcon(new ImageIcon(AddAppointmentPanel.class.getResource("/graphics/list_background.png")));
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
		 * DATE
		 */
		JLabel lblDate = new JLabel("Date: (DD/MM/YYYY)");
		lblDate.setFont(new Font("Arial", Font.BOLD, 16));
		lblDate.setBounds(925, 339, 300, 14);
		/*
		 * Text Field for Appointment Date
		 */
		tfDate = new JTextField();
		tfDate.setBounds(900, 364, 200, 20);
		tfDate.setColumns(10);
		/*
		 * START TIME
		 */
		JLabel lbStartTime = new JLabel("Start Time: (HH:MM)");
		lbStartTime.setFont(new Font("Arial", Font.BOLD, 16));
		lbStartTime.setBounds(760, 575, 300, 14);
		/*
		 * Drop-down menu for Appointment Start Time
		 */
		JComboBox<String> jcStartTime = new JComboBox<String>(timeSlots);
		jcStartTime.setSelectedIndex(0);
		jcStartTime.setBounds(788, 600, 100, 20);
		/*
		 * END TIME
		 */
		JLabel lbEndTime = new JLabel("End Time: (HH:MM)");
		lbEndTime.setFont(new Font("Arial", Font.BOLD, 16));
		lbEndTime.setBounds(1050, 575, 300, 14);
		/*
		 * Drop-down for Appointment End Time
		 */
		JComboBox<String> jcEndTime = new JComboBox<String>(timeSlots);
		jcEndTime.setSelectedIndex(0);
		jcEndTime.setBounds(1078, 600, 100, 20);
		/*
		 * DEPARTMENT
		 */
		JLabel lbDepartment = new JLabel("Department: ");
		lbDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		lbDepartment.setBounds(795, 450, 250, 50);
		/*
		 * DEPARMENT LIST DROP-DOWN MENU
		 */
		JComboBox<String> jcDepartment = new JComboBox<String>(hms.getStringArray(hms.getDepartmentRecord()));
		jcDepartment.setSelectedIndex(0);
		jcDepartment.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Clears the combo box
				jcDoctors.removeAllItems();
				
				String[] docList = hms.getDoctorsInDepartment((String)jcDepartment.getSelectedItem());
				for (int i=0; i< docList.length; i++) 
				{
					//Add the list of doctors into the combo box
					jcDoctors.addItem(docList[i]);
				}
			}
		});
		jcDepartment.setBounds(750, 500, 200, 20);
		/*
		 * DOCTORS
		 */
		JLabel lbDoctors = new JLabel("Doctor: ");
		lbDoctors.setFont(new Font("Arial", Font.BOLD, 16));
		lbDoctors.setBounds(1090, 450, 250, 50);
		/*
		 * DOCTORS LIST DROP-DOWN MENU
		 */
		String[] list = {"N/A"};
		// Sets the contents of the doctor drop-down menu to match the department.
		if (hms.getDoctorsInDepartment((String) jcDepartment.getSelectedItem()).length > 0)
		{
			list = hms.getDoctorsInDepartment((String) jcDepartment.getSelectedItem());
		}

		jcDoctors = new JComboBox<String>(list);
		jcDoctors.setSelectedIndex(0);
		jcDoctors.setBounds(1045, 500, 200, 20);
		/*
		 * CANCEL BUTTON
		 */
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Initially clearing all field colors and content
				clearRedField();
				clearTextField();
				
				if(hms.getAccessFrom() == "Admin")
				{
					hms.displayPatientListPage();
				}
				else if(hms.getAccessFrom() == "Employee")
				{
					hms.displayEmployeeMainPage();
				}
			}
		});
		btnCancel.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancel.setBounds(1400, 950, 169, 59);
		/*
		 * SUBMIT BUTTON
		 */
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 16));
		btnSubmit.setBounds(370, 950, 169, 59);
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Initially clearing all field colors
				clearRedField();
	
		    	if(formComplete())
						{
							//If all input is correct, add this appointment
							if(val.validateAppointment(tfDate.getText(), jcStartTime.getSelectedItem().toString(), jcEndTime.getSelectedItem().toString())) 
							{
								hms.addAppointment(tfDate.getText(), jcStartTime.getSelectedItem().toString(), jcEndTime.getSelectedItem().toString());
								//display confirmation message
								Object[] options = {"Ok"};
								JOptionPane.showOptionDialog(null, "Appointment added.", "Success",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
								null, options, options[0]);
								//go back to previous menu
								clearTextField();
								//Resetting dropdown selection fields to default
								jcStartTime.setSelectedIndex(0);
								jcEndTime.setSelectedIndex(0);
								clearRedField();
								//Resetting dropdown selection fields' colour
								jcStartTime.setBackground(Default);
								jcEndTime.setBackground(Default);
								
								
								hms.displayPatientListPage();
							}
							
							//Otherwise, find out which field(s) are incorrect
							else 
							{
								//Checking if date input isn't valid
								if(!val.validateDate(tfDate.getText()))
								{
									tfDate.setBackground(Red);
								}
								
								//Checking if time input isn't valid
								if(!val.validateTime(jcStartTime.getSelectedItem().toString(), jcEndTime.getSelectedItem().toString()))
								{
									jcStartTime.setBackground(Red);
									jcEndTime.setBackground(Red);
								}
								
								Object[] options = {"Close"};
								JOptionPane.showOptionDialog(null, "Please ensure all highlighted entries are correct", "Warning",
								JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
								null, options, options[0]);
							}
						}
						
						else
						{
							//display warning message if any fields are empty 
							Object[] options = {"Close"};
							JOptionPane.showOptionDialog(null, "Please fill in all information.", "Warning",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
						}
					}
				});
				// Adds all the components to the panel.
				addAppointmentPanel.add(lbDoctors);
				addAppointmentPanel.add(jcDoctors);
				addAppointmentPanel.add(lbDepartment);
				addAppointmentPanel.add(jcDepartment);
				addAppointmentPanel.add(lblDate);
				addAppointmentPanel.add(tfDate);
				addAppointmentPanel.add(lbStartTime);
				addAppointmentPanel.add(jcStartTime);
				addAppointmentPanel.add(lbEndTime);
				addAppointmentPanel.add(jcEndTime);
				addAppointmentPanel.add(btnSubmit);
				addAppointmentPanel.add(btnCancel);
				addAppointmentPanel.add(lblWelcomeBackAdministrator);
				addAppointmentPanel.add(date);
				addAppointmentPanel.add(lblBackground);
				
				return addAppointmentPanel;
			}
			
			/**
			 * This method returns true if form is completely filled out
			 * (Need to redo due to changes from textfield to JComboBox)
			 */
			private boolean formComplete() 
			{
				//add all the text fields to an array
				ArrayList<JTextField> allTextFields = new ArrayList<JTextField>();
				allTextFields.add(tfDate);
				
				//loop through array checking if they are not empty
				for(JTextField t : allTextFields)
				{
					if(!(t.getText().length() > 0))
					{
						return false;
					}
				}
				return true;
			}
			
			/**
			 * This method resets all the text fields
			 */
			private void clearTextField() 
			{
				tfDate.setText("");
			}
			
			/**
			 * This method resets all the text field colors
			 */
			private void clearRedField()
			{
				tfDate.setBackground(Default);
			}
}
