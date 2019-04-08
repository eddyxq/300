package unitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import gui.AddAppointmentPanel;
import system.Hospital_Management_System;

//JUnit Tests for testing if panel classes are returned properly.
public class JUnit_Panels {
	Hospital_Management_System hms = new Hospital_Management_System();
	AddAppointmentPanel aap = new AddAppointmentPanel();
	
	@Test
	public void addAppointmentPanelReturned() {
		assertNotNull("The panel for AddAppointmentPanel should be returned.", aap.createPanel(hms));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
