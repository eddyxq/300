package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import user.Patient;

/*
 * This class is used to read text files 
 */
public class TextReader 
{
	ArrayList<Patient> patientRecord = new ArrayList<Patient>();
	/**
	 * This methods reads and restores patient data.
	 */
	public ArrayList<Patient> load() 
	{
		try 
		{
			Scanner reader = new Scanner(new File("PatientRecords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				String[] patientInfo = line.split(" ");
				Patient p = new Patient(patientInfo[1], patientInfo[2], patientInfo[3], patientInfo[4], patientInfo[5], patientInfo[6]);
				p.setId(Integer.parseInt(patientInfo[0]));
				patientRecord.add(p);
				p.setAppointmentDate(patientInfo[7]);
				p.setAppointmentTime(patientInfo[8]);
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return patientRecord;
	}
	
	/**
	 * @param user A string for the username that is entered by the user
	 * @param pass A string for the password that is entered by the user to check
	 * @return a boolean that returns whether the user is valid in the system
	 */
	public String checkCredentials(String user, String pass) 
	{
		boolean userfound = false;
		try 
		{
			Scanner reader = new Scanner(new File("adminPasswords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				String[] credentials = line.split(" ");
				String username = credentials[0];
				String password = credentials[1];
				//two types of employees: admins and physicians
				String employeeType = credentials[2];
				if((username.equals(user)) && (password.equals(pass)))
				{
					//a for admin, e for other employees
					return employeeType.equals("a") ? "valid_a" : "valid_e";					
				}
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		
		return "invalid";
	}
}
