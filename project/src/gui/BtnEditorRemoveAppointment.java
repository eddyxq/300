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
public class BtnEditorRemoveAppointment extends DefaultCellEditor
{
	private static final long serialVersionUID = 1L;
	int id;
	Hospital_Management_System hms;
	protected JButton btn;
	private String lbl;
	private Boolean clicked;
	Appointment app;
	
	public BtnEditorRemoveAppointment(JTextField txt, Hospital_Management_System hms, Appointment app) 
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
			int selection = JOptionPane.showOptionDialog(null, "Are you sure you want to remove the appointment?", "Warning",
			JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
			null, options, options[0]);	
			if(selection == 0) {
				int index = hms.getAppointmentRec().indexOf(app);
				hms.getAppointmentRec().remove(index);
				hms.displayPatientListPage();
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
