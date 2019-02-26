package display;

public class MenuDisplay {
	
		private void selectCommand() {
			System.out.println("\n---------------");
			System.out.println("Select Command:");
			System.out.println("---------------");
		}
	/*
	 * Menu Displays
	 */
		
		/*
		 * Patient related menus
		 */
		public void displayPatientManagementMenu() 
		{
			selectCommand();
			System.out.println("1. Add A New Patient");
			System.out.println("2. View Patient List");
			System.out.println("3. Edit Patient");
			System.out.println("0. Exit");
		}
		
		public void displayPatientPortal() 
		{
			selectCommand();
			System.out.println("1. View Appointment");
			System.out.println("2. Cancel An Appointment");
			System.out.println("0. Exit");
		}
		
		public void displayPatientAppointmentSetting() {
			selectCommand();
			System.out.println("1. Edit Patient Appointment");
			System.out.println("2. Cancel Patient Appointment");
			System.out.println("0. Exit");
		}
		
		/*
		 * Employee related menus
		 */
		public void displayEmployeeManagementMenu() 
		{
			selectCommand();
			System.out.println("1. Add A New Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Edit Employee");
			System.out.println("0. Exit");
		}

		public void displayEmployeePortal() 
		{
			selectCommand();
			System.out.println("1. View Schedule");
			System.out.println("0. Exit");
		}

		/*
		 * Admin related menus
		 */
		public void displayAdminPortal() 
		{
			selectCommand();
			System.out.println("1. Manage Patient Records");
			System.out.println("2. Manage Employee Records");
			System.out.println("0. Exit");
		}

		public void displayMainMenu() 
		{
			System.out.println("\n-------------------");
			System.out.println("Select user module:");
			System.out.println("-------------------");
			System.out.println("1. Admin");
			System.out.println("2. Patient");
			System.out.println("3. Employee");
			System.out.println("0. Exit");
		}
		
		public void displayDetailSelections() {
			selectCommand();
			System.out.println("1. Patient Details");
			System.out.println("2. Employee Details");
			System.out.println("0. Exit");
		}
}
