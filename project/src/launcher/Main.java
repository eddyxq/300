package launcher;

import system.Hospital_Management_System;

/**
 * This class is the starting execution point of the system.
 * @author Team 3 - SENG 300 - L02
 * @version 4.0
 * @since April 4, 2019
 */
public class Main 
{
	/** 
     * This method starts the system 
     */
	public static void main(String[] args)
	{
		Hospital_Management_System hms = new Hospital_Management_System();
		hms.startHMS();
	}
}