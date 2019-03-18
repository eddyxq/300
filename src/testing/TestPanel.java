package testing;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TestPanel extends JPanel {
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JLabel lblUsername;
	private JLabel lblPassword;
	//private String[] departments = { "General Practitioner", "Nurse", "Operation Staff", "Physician", "Surgeon" };
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		setBounds(0, 0, 1920, 1080);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogin.setBounds(854, 675, 225, 71);
		add(btnLogin);
		
		tfUsername = new JTextField();
		tfUsername.setFont(new Font("Tahoma", Font.PLAIN, 19));
		tfUsername.setBounds(711, 466, 518, 38);
		add(tfUsername);
		tfUsername.setColumns(10);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(711, 577, 518, 38);
		add(tfPassword);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblUsername.setBounds(711, 423, 280, 32);
		add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(711, 534, 280, 32);
		add(lblPassword);
		
//		JButton btnNewButton = new JButton("Admin or Staff? Click here to login");
//		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
//		btnNewButton.setBounds(1581, 949, 287, 85);
//		add(btnNewButton);
		
//		JButton btnNewButton_1 = new JButton("");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_1.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/return_icon.png")));
//		btnNewButton_1.setBounds(50, 935, 107, 99);
//		add(btnNewButton_1);
//		
//		JLabel lblAdminIcon = new JLabel("New label");
//		lblAdminIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/admin_icon.png")));
//		lblAdminIcon.setBounds(398, 466, 380, 380);
//		add(lblAdminIcon);
//		
//		JLabel lbStaffIcon = new JLabel("New label");
//		lbStaffIcon.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/staff_icon.png")));
//		lbStaffIcon.setBounds(1131, 466, 380, 380);
//		add(lbStaffIcon);

		
		JLabel lbBackground = new JLabel("");
		lbBackground.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/patientID_background.png")));
		lbBackground.setBounds(0, 0, 1920, 1080);
		add(lbBackground);
	}
}
