package gui;

import java.util.Calendar;

/*
 * This class is used to ensure all input is valid 
 */
public class ValidateInput {
	
	public boolean validatePatient(String n1, String n2, String d, String m, String y, String ph, String em)
	{
		if(!this.validateName(n1) || !this.validateName(n2) || !this.validateDay(d) || !this.validateMonth(m) 
				|| !this.validateYear(y) || !this.validatePhone(ph) || !this.validateEmail(em))
		{
			return false;
		}
		
		return true;
	}
	
	public boolean validateAppointment(String date, String time)
	{
		if(!this.validateDate(date) || !this.validateTime(time))
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
		
		if(d.length() != 2 || !d.matches("[0-9]+") || Integer.parseInt(d) < 1 || Integer.parseInt(d) > 31)
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if month entry is valid
	public boolean validateMonth(String m)
	{
		//Ensuring month entry is a number and meets length constraint
		if(m.length() != 2 || !m.matches("[0-9]+") || Integer.parseInt(m) < 1 || Integer.parseInt(m) > 12)
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
		if(phCheck.length() != 10 || !phCheck.matches("[0-9]+"))
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if email entry is valid
	public boolean validateEmail(String em)
	{
		//Ensuring email entry contains @ symbol, and has at least length 3
		if(em.length() < 3 || !em.contains("@") || !em.contains("."))
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if date entry is valid
	public boolean validateDate(String date)
	{
		//Ensuring date entry contains / symbol, and has 3 parts (DD/MM/YYYY)
		if(!date.contains("/"))
		{
			return false;
		}
		
		//Splitting string by / signs
		String parts[] = date.split("/");
		
		//If there aren't 3 parts to the date input, it isn't valid
		if(parts.length != 3)
		{
			return false;
		}
		
		//If the day or month are more than 2 digits, or the year is more than 4, it is invalid
		if(parts[0].length() != 2 || parts[1].length() != 2 | parts[2].length() != 4)
		{
			return false;
		}	
		
		//Finally, checking the input values for appropriate day, month, and year range
		if(!this.validateDay(parts[0]) || !this.validateMonth(parts[1]))
		{
			return false;
		}
		
		//Getting value of current year to compare entry 
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		
		//Prevent settin appointments in the past
		if(Integer.parseInt(parts[2]) < thisYear)
		{
			return false;
		}
		
		return true;
	}
	
	//Returns true if phone number entry is valid
	public boolean validateTime(String time)
	{
		//Ensuring time entry contains : and fulfills length and value constraints (HH:MM)
		if(!time.contains(":"))
		{
			return false;
		}
		
		//Splitting string by :
		String parts[] = time.split(":");
		
		//Valid date should have exactly 2 parts
		if(parts.length != 2)
		{
			return false;
		}
		
		//Length of the strings should be 2
		if(parts[0].length() != 2 || parts[1].length() != 2)
		{
			return false;
		}
		
		if(Integer.parseInt(parts[0]) > 23 || Integer.parseInt(parts[1]) > 60)
		{
			return false;
		}
		
		return true;
	}
}
