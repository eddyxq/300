package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import user.Employee;
import user.Patient;

/* 
 * This class is used to write date to a text file.
 */
public class TextWriter 
{
	/*
	 * This method will save the patient data.
	 */
	public void savePatientData(ArrayList<Patient> patientRecord) 
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
	/*
	 * This method will save the employee data.
	 */
	public void saveEmployeeData(ArrayList<Employee> employeeRecord) 
	{
		PrintWriter writer;
		try 
		{
			writer = new PrintWriter(new BufferedWriter(new FileWriter("EmployeeRecords.txt", false)));
			int count = 1;
			String data = "";
			for (Employee e : employeeRecord)
			{
				data = count + " " 
							+ e.firstName + " " 
							+ e.lastName + " " 
							+ e.sex + " " 
							+ e.dob + " " 
							+ e.phoneNumber + " " 
							+ e.email + " "
							+ e.department;
				writer.println(data);
				count++;
			}
			writer.close();
		} 
		catch (IOException e) {}
	}
	/*
	 * This method will save the department data.
	 */
	public void saveDepartmentData(ArrayList<String> departmentRecord) 
	{
		PrintWriter writer;
		try 
		{
			writer = new PrintWriter(new BufferedWriter(new FileWriter("DepartmentRecords.txt", false)));
			for (int i = 0; i < departmentRecord.size(); i++)
			{
				writer.println(departmentRecord.get(i));
			}
			writer.close();
		} 
		catch (IOException e) {}
	}
}
