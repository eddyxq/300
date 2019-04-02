package gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import system.Hospital_Management_System;

/**
 * This class edits the Jbutton.
 * @reference ProgrammingWizards TV's Youtube java tutorials.
 */
public class BtnEditorAddAppointment extends DefaultCellEditor
{
	private static final long serialVersionUID = 1L;
	int id;
	Hospital_Management_System hms;
	protected JButton btn;
	private String lbl;
	private Boolean clicked;

	public BtnEditorAddAppointment(JTextField txt, Hospital_Management_System hms, int id) 
	{
		super(txt);
		this.hms = hms;
		this.id = id;
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
			System.out.println(id);
			hms.displayAddAppointmentPage();
			hms.setId(this.id);
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
