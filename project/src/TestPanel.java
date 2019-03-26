import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TestPanel extends JPanel {
	private String[] departmentList = {"General Pracitioner", "Operation Staff", "Physician", "Surgeon"};
	private String[] practioners = {"Doctor Strange", "Doctor Who"};
	private String[] surgeons = {"surgeon1, surgeon2"};
	private JTextField tfDepartment;
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(383, 942, 400, 59);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(1133, 942, 400, 59);
		add(btnNewButton_1);
		
		tfDepartment = new JTextField();
		tfDepartment.setBounds(809, 540, 300, 30);
		add(tfDepartment);
		tfDepartment.setColumns(10);
		
		JLabel lbDepartment = new JLabel("Department");
		lbDepartment.setBounds(941, 515, 46, 14);
		lbDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbDepartment);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/addDepartment_background.png")));
		label.setBounds(0, 0, 1920, 1080);
		add(label);

	}
}
