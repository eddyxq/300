package launcher;

import javax.swing.JPanel;

import display.LogIn;
import system.Hospital_Management_System;

/**
 * This class is the starting execution point of the system.
 * @author Team 3 - SENG 300 - L02
 * @version 1.0
 * @since February 16, 2019
 */
public class Main 
{
	/** 
     * This method starts the system 
     */
	public static void main(String[] args)
	{
		//Hospital_Management_System hms = new Hospital_Management_System();
		//LogIn l = new LogIn(hms);
		//l.start(hms);
		//hms.start();
		
		AddPatientPanel addPatientPanel = new AddPatientPanel();
		JPanel a = addPatientPanel.createPanel();
		
		Gui gui = new Gui(a);
	}
}