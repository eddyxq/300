package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import user.Employee;
import user.Patient;

/*
 * This class is used to read text files 
 */
public class TextReader 
{
	/**
	 * This methods reads and restores patient data.
	 */
	public ArrayList<Patient> loadPatientData() 
	{
		ArrayList<Patient> patientRecord = new ArrayList<Patient>();
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
	 * This methods reads and restores employee data.
	 */
	public ArrayList<Employee> loadEmployeeData() 
	{
		ArrayList<Employee> employeeRecord = new ArrayList<Employee>();
		try 
		{
			Scanner reader = new Scanner(new File("EmployeeRecords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				String[] employeeInfo = line.split(" ");
				Employee e = new Employee(employeeInfo[1], employeeInfo[2], employeeInfo[3], employeeInfo[4], employeeInfo[5], employeeInfo[6]);
				e.setId(Integer.parseInt(employeeInfo[0]));
				employeeRecord.add(e);
				e.setAppointmentDate(employeeInfo[7]);
				e.setAppointmentTime(employeeInfo[8]);
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return employeeRecord;
	}
	
	/**
	 * @param user A string for the username that is entered by the user
	 * @param pass A string for the password that is entered by the user to check
	 * @return a boolean that returns whether the user is valid in the system
	 */
	public String checkCredentials(String user, String pass) 
	{
		Scanner reader = null;
		try 
		{
			reader = new Scanner(new File("adminPasswords.txt"));
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
			
		} 
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("File not found");
		}
		finally
		{
			reader.close();
		}
		return "invalid";
	}
}
