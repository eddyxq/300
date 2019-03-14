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
}
