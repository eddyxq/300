package testing;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TestPanel extends JPanel {
	//private String[] departments = { "General Practitioner", "Nurse", "Operation Staff", "Physician", "Surgeon" };
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(495, 885, 189, 85);
		add(btnNewButton);
		
		JLabel lblAdminIcon = new JLabel("New label");
		lblAdminIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/admin_icon.png")));
		lblAdminIcon.setBounds(398, 466, 380, 380);
		add(lblAdminIcon);
		
		JLabel lbStaffIcon = new JLabel("New label");
		lbStaffIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/staff_icon.png")));
		lbStaffIcon.setBounds(1131, 466, 380, 380);
		add(lbStaffIcon);
		
//		JComboBox departmentList = new JComboBox(departments);
//		departmentList.setLocation(454, 484);
//		departmentList.setSize(300, 20);
//		departmentList.setSelectedIndex(0);
//		add(departmentList);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/login_background.png")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		add(lblNewLabel);
		
		JButton button = new JButton("New button");
		button.setBounds(1234, 895, 189, 85);
		add(button);
	}
}
