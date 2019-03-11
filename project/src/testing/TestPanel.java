package testing;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class TestPanel extends JPanel {
	private String[] departments = { "General Practitioner", "Nurse", "Operation Staff", "Physician", "Surgeon" };
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		JComboBox departmentList = new JComboBox(departments);
		departmentList.setLocation(454, 484);
		departmentList.setSize(300, 20);
		departmentList.setSelectedIndex(0);
		add(departmentList);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/AddPatientBackground.png")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		add(lblNewLabel);
	}
}
