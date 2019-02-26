package display;

public class ErrorMessages {
	
	public void displayNoPatient() {
		System.out.println("No patients are available.\n");
	}
	
	public void displayInvalidID() {
		System.out.println("The ID you entered does not exist, please try again.\n");
	}
	
	public void displayNoAppointment() {
		System.out.println("You do not have an upcoming appointment.\n");
	}
	
	public void invalidDateFormat() {
		System.out.println("The date you entered was invalid.\n");
	}
}
