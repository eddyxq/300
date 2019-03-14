package gui;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import system.Hospital_Management_System;

public class AdminLogIn extends JPanel {
	public AdminLogIn() {
	}
	private String[] departments = { "General Practitioner", "Nurse", "Operation Staff", "Physician", "Surgeon" };
	private JPasswordField passwordField;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public JPanel createPanel(Hospital_Management_System hms) {
		JPanel adminPanel = new JPanel();
		adminPanel.setLayout(null);
		adminPanel.setBounds(0, 0, 1920, 1080);
		
		
		textField = new JTextField();
		textField.setBounds(456, 276, 116, 22);
		adminPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(456, 311, 122, 22);
		adminPanel.add(passwordField);

		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				hms.checkCredentials(textField.getText(),passwordField.getPassword().toString());
			}
		});
		btnLogin.setBounds(237, 463, 97, 25);
		adminPanel.add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				adminPanel.setVisible(false);
			}
		});
		btnBack.setBounds(609, 463, 97, 25);
		adminPanel.add(btnBack);
		return adminPanel;
	}
}
