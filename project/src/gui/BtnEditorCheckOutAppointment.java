package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import system.Appointment;
import system.Hospital_Management_System;

/**
 * This class edits the Jbutton.
 * @reference ProgrammingWizards TV's Youtube java tutorials.
 */
class BtnEditorCheckOutAppointment extends DefaultCellEditor
{
	private static final long serialVersionUID = 1L;
	private Hospital_Management_System hms;
	private JButton btn;
	private String lbl;
	private Boolean clicked;
	private Appointment app;
	
	BtnEditorCheckOutAppointment(JTextField txt, Hospital_Management_System hms, Appointment app) 
	{
		super(txt);
		this.hms = hms;
		this.app = app;
		btn = new JButton();
		btn.setOpaque(true);
		btn.addActionListener(new ActionListener() 
		{
		    @Override
		    public void actionPerformed(ActionEvent e) 
		    {
			    fireEditingStopped();
		    }
		});
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object obj, boolean selected, int row, int col) 
	{
		lbl = (obj == null) ? "" : obj.toString();
		btn.setText(lbl);
		clicked = true;
		return btn;
	}

	@Override
	public Object getCellEditorValue() 
	{
		if(clicked)
		{
			Object[] options = {"Yes", "Cancel"};
			int selection = JOptionPane.showOptionDialog(null, "Do you want to check out this patient for this appointment?", "Warning",
			JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
			null, options, options[0]);	
			int index = hms.getAppointmentRec().indexOf(app);
			if(selection == 0) {
				if(hms.getAppointmentRec().get(index).getCheckInStatus() == true) 
				{
					//Checks out the appointment if checked in.
					hms.getAppointmentRec().get(index).checkOut();
					int checkOutOptions = JOptionPane.showOptionDialog(null, "Patient has checked out successfully!\n"
							+ "Do you want to remove the appointment now?", "Success!", 
							JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
							null, options, options[0]);
					if(checkOutOptions == 0) 
					{
						//Removes the appointment.
						hms.getAppointmentRec().remove(index);
						JOptionPane.showMessageDialog(null, "Appointment was removed successfully!", "Success!", JOptionPane.INFORMATION_MESSAGE);
					}
					hms.displayPatientListPage();
				}else 
				{
					JOptionPane.showMessageDialog(null, "Patient is not checked in!", "Error!", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		}
		clicked = false;
		return new String(lbl);
	}
	
	@Override
	public boolean stopCellEditing() 
	{
	    clicked = false;
		return super.stopCellEditing();
	}
	
	@Override
	protected void fireEditingStopped() 
	{
		super.fireEditingStopped();
	}
}
