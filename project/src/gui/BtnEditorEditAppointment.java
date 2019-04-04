package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import system.Appointment;
import system.Hospital_Management_System;

/**
 * This class edits the Jbutton.
 * @reference ProgrammingWizards TV's Youtube java tutorials.
 */
class BtnEditorEditAppointment extends DefaultCellEditor
{
	private static final long serialVersionUID = 1L;
	private Appointment app;
	private Hospital_Management_System hms;
	private JButton btn;
	private String lbl;
	private Boolean clicked;

	BtnEditorEditAppointment(JTextField txt, Hospital_Management_System hms, Appointment app) 
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
			hms.setCurrentAppointment(app);
			hms.displayEditAppointmentPage();
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
