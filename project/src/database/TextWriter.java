package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import user.Patient;

/* 
 * This class is used to write patient date to a text file.
 */
public class TextWriter 
{
	ArrayList<Patient> patientRecord;
	/**
	 * This constructor will initialize the record.
	 */
	public TextWriter(ArrayList<Patient> patientRecord)
	{
		this.patientRecord = patientRecord;
	}
	/**
	 * This method saves the patient data to text file.
	 */
	public void save() 
	{
		PrintWriter writer;
		try 
		{
			writer = new PrintWriter(new BufferedWriter(new FileWriter("PatientRecords.txt", false)));
			int count = 1;
			String data = "";
			for (Patient p : patientRecord)
			{
				data = count + " " 
							+ p.firstName + " " 
							+ p.lastName + " " 
							+ p.sex + " " 
							+ p.dob + " " 
							+ p.phoneNumber + " " 
							+ p.email + " " 
							+ p.getAppointmentDate() + " " 
							+ p.getAppointmentTime();
				writer.println(data);
				count++;
			}
			writer.close();
		} 
		catch (IOException e) {}
	}
}
