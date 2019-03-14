package database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import user.Patient;

/*
 * This class is used to read text files 
 */
public class PasswordReader 
{

	
	/**
	 * @param user A string for the username that is entered by the user
	 * @param pass A string for the password that is entered by the user to check
	 * @return a boolean that returns whether the user is valid in the system
	 */
	public boolean validUser(String user, String pass) 
	{
		boolean userfound = false;
		try 
		{
			Scanner reader = new Scanner(new File("/database/adminPasswords.txt"));
			while (reader.hasNext()) 
			{
				String line = reader.nextLine();
				String[] credentials = line.split(" ");
				String username = credentials[0];
				String password = credentials[1];
				
				if((username == user) && (password == pass)){
					userfound = true;
					return userfound;
				}
			}
			reader.close();
		} 
		catch (FileNotFoundException fnfe) {}
		return userfound;
	}
}
