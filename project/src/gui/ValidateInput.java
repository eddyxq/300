package gui;

import java.util.Calendar;

/*
 * This class is used to ensure all input is valid 
 */
public class ValidateInput {
	
	//Checking if all input to create a patient is correct
	public boolean validatePatient(String n1, String n2, String d, String m, String y, String ph, String em)
	{
		if(!this.validateName(n1) || !this.validateName(n2) || !this.validateDay(d) || !this.validateMonth(m) 
				|| !this.validateYear(y) || !this.validatePhone(ph) || !this.validateEmail(em))
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if name entry is valid
	public boolean validateName(String n1)
	{
		//Ensuring a name entry is all letters
		char[] check = n1.toCharArray();
		for(char f: check)
		{
			if (!Character.isLetter(f))
			return false;
		}
		
		return true;
	}
	

	//Returns true if day entry is valid
	public boolean validateDay(String d)
	{
		
		if(d.length() > 2 || !d.matches("[0-9]+") || Integer.parseInt(d) < 1 || Integer.parseInt(d) > 31)
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if month entry is valid
	public boolean validateMonth(String m)
	{
		//Ensuring month entry is a number and meets length constraint
		if(m.length() > 2 || !m.matches("[0-9]+") || Integer.parseInt(m) < 1 || Integer.parseInt(m) > 12)
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if year entry is valid
	public boolean validateYear(String y)
	{
		//Getting value of current year to compare entry 
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		
		//Ensuring year entry is a number and meets length constraint
		// also comparison to avoid registering patients with future birth date
		if(y.length() > 4 || !y.matches("[0-9]+") || Integer.parseInt(y) < 1 || Integer.parseInt(y) > thisYear)
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if phone number entry is valid
	public boolean validatePhone(String ph)
	{
		//Ensuring phone number entry is a number and meets length/content constraint
		String phCheck = ph.replaceAll("-", "");
		if(phCheck.length() > 10 || !phCheck.matches("[0-9]+"))
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if email entry is valid
	public boolean validateEmail(String em)
	{
		//Ensuring email entry contains @ symbol and has at least length 3
		if(em.length() < 3 || !em.contains("@"))
		{
			return false;
		}
		
		return true;
	}
}
