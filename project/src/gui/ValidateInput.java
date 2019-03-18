package gui;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class is used to ensure all input is valid 
 * @author Team 3 - SENG 300 - L02
 * @version 1.0
 * @since March 17, 2019
 */
public class ValidateInput {
	
	/*
	 * This method returns true if all entries of a patient form are valid
	 */
	public boolean validatePatient(String name1, String name2, String day, String month, String year, String phone, String email)
	{
		if(!this.validateName(name1) || !this.validateName(name2) || !this.validateDay(day, month, year) || !this.validateMonth(month) 
				|| !this.validateBirthYear(year) || !this.validatePhone(phone) || !this.validateEmail(email))
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true all elements of an appointment form are valid
	 */
	public boolean validateAppointment(String date, String time)
	{
		if(!this.validateDate(date) || !this.validateTime(time))
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if a name entry is valid
	 */
	public boolean validateName(String name1)
	{
		//Ensuring a name entry is all letters
		char[] check = name1.toCharArray();
		for(char f: check)
		{
			if (!Character.isLetter(f))
			return false;
		}
		
		return true;
	}
	

	/*
	 * This method returns true if the day entry is valid
	 */
	public boolean validateDay(String day, String month, String year)
	{
		//Day cannot be validated without valid month and year
		if(!this.validateMonth(month) || !this.validateBirthYear(year))
		{
			return false;
		}
		
		if(day.length() != 2 || !day.matches("[0-9]+") || Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31)
		{
			return false;
		}
	
		int theDay = 0, theMonth = 0, theYear = 0;
		
		try {
			theDay = Integer.parseInt(day);
			theMonth = Integer.parseInt(month);
			theYear = Integer.parseInt(year);
		} catch (NumberFormatException nfe) {
			//If the current date (despite passing other validations cannot be parsed as an int
		}
		
		Calendar cal = new GregorianCalendar();
	
		//Default values will cause validation to return false
		if(theDay == 0 || theMonth == 0 || theYear == 0)
		{
			return false;
		}
		
		//Ensures the calendar does not accept invalid dates
		cal.setLenient(false);
	
		cal.set(theYear, theMonth-1, theDay);
		
		try 
		{
			cal.getTime();
		}
		
		catch(IllegalArgumentException iae)
		{
			//Invalid date, determined by calendar method; return false
			return false;
		}
		
		
		return true;
	}
	
	/*
	 * This method returns true if the month entry is valid
	 */
	public boolean validateMonth(String month)
	{
		//Ensuring month entry is a number and meets length constraint
		if(month.length() != 2 || !month.matches("[0-9]+") || Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12)
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the year entry is valid
	 */
	public boolean validateYear(String year)
	{
		//Getting value of current year to compare entry 
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		
		//Ensuring year entry is a number and meets length constraint
		// also comparison to avoid registering patients with future birth date
		if(year.length() > 4 || !year.matches("[0-9]+") || Integer.parseInt(year) < 1 || Integer.parseInt(year) < thisYear)
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the year of a patient's birth is valid
	 */
	public boolean validateBirthYear(String year)
	{
		//Getting value of current year to compare entry 
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		
		//Ensuring year entry is a number and meets length constraint
		// also comparison to avoid registering patients with future birth date
		if(year.length() > 4 || !year.matches("[0-9]+") || Integer.parseInt(year) < 1 || Integer.parseInt(year) > thisYear)
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the phone number entry is valid
	 */
	public boolean validatePhone(String phone)
	{
		//Ensuring phone number entry is a number and meets length/content constraint
		String phCheck = phone.replaceAll("-", "");
		if(phCheck.length() != 10 || !phCheck.matches("[0-9]+"))
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the email entry is valid
	 */
	public boolean validateEmail(String email)
	{
		//Ensuring email entry contains @ symbol, and has at least length 3
		if(email.length() < 3 || !email.contains("@") || !email.contains("."))
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the overall date entry is valid
	 */
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
		if(!this.validateDay(parts[0], parts[1], parts[2]) || !this.validateMonth(parts[1]))
		{
			return false;
		}
		
		//Getting value of current year to compare entry 
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH) +1; //Months start at 0
		int thisDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		//Prevent setting appointments in the past
		//Failure conditions described in order:
		//Year entry less than current year
		//Current year, month less than current month
		//Current year and month, day less than current day
		if(Integer.parseInt(parts[2]) < thisYear || 
		(Integer.parseInt(parts[2]) == thisYear && Integer.parseInt(parts[1]) < thisMonth) ||
		(Integer.parseInt(parts[2]) == thisYear && Integer.parseInt(parts[1]) == thisMonth)
		&& Integer.parseInt(parts[0]) < thisDay)
		{
			return false;
		}
		
		return true;
	}
	
	/*
	 * This method returns true if the time entry is valid
	 */
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
