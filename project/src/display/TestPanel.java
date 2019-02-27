package display;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TestPanel extends JPanel {
	private Font bArial = new Font("Arial", Font.BOLD, 30);
	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setSize(1920, 1080);
		setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(bArial);
		btnAdmin.setBounds(550, 847, 211, 111);
		add(btnAdmin);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.setFont(bArial);
		btnPatient.setBounds(1187, 847, 211, 111);
		add(btnPatient);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TestPanel.class.getResource("/graphics/login_background.png")));
		lblNewLabel.setBounds(48, -11, 1920, 1080);
		add(lblNewLabel);
	}
}
