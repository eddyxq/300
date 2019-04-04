package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import system.Appointment;
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
				Employee e = new Employee(employeeInfo[1], employeeInfo[2], employeeInfo[3], employeeInfo[4], employeeInfo[5], employeeInfo[6], employeeInfo[7]);
				e.setId(Integer.parseInt(employeeInfo[0]));
				employeeRecord.add(e);
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return employeeRecord;
	}
	/**
	 * This methods reads and restores employee data.
	 */
	public ArrayList<Appointment> loadAppointmentData() 
	{
		ArrayList<Appointment> appointmentRecord = new ArrayList<Appointment>();
		try 
		{
			Scanner reader = new Scanner(new File("AppointmentRecords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				String[] appointmentInfo = line.split("_");
				Appointment app = new Appointment(appointmentInfo[0], appointmentInfo[1], appointmentInfo[2], appointmentInfo[3], appointmentInfo[4]);
				appointmentRecord.add(app);
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return appointmentRecord;
	}
	/**
	 * This methods reads and restores department data.
	 */
	public ArrayList<String> loadDepartmentData() 
	{
		ArrayList<String> departmentRecord = new ArrayList<String>();
		try 
		{
			Scanner reader = new Scanner(new File("DepartmentRecords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				departmentRecord.add(line);
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return departmentRecord;
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
			reader = new Scanner(new File("EmployeeAccounts.txt"));
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
